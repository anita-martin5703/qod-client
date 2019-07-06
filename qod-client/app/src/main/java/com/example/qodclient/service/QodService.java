package com.example.qodclient.service;


import com.example.qodclient.BuildConfig;
import com.example.qodclient.model.Quote;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.Nullable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface QodService {

    @GET("quotes/random")
    Single<Quote> random();

    @GET("quotes/search")
    Single<Quote> searchText();
    Observable<List<Quote>> search(@Query("q") String filter);

    static QodService getInstance(){
        return InstanceHolder.INSTANCE;
    }

    class InstanceHolder {

        private static final QodService INSTANCE;

        static {
            // Following five lines should be removed/commented out for production release.
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .build();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .client(client)// This should be removed/commented out for production release.
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create()) //TODO check; maybe change?
                    .build();
            INSTANCE = retrofit.create(QodService.class);
        }

    }

}
