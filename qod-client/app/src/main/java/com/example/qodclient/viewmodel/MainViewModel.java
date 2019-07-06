package com.example.qodclient.viewmodel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.qodclient.model.Quote;
import com.example.qodclient.service.QodService;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private MutableLiveData<Quote> random;
    private MutableLiveData<List<Quote>> search;

    private CompositeDisposable pending = new CompositeDisposable();

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Quote> getRandomQuote() {
        if (random == null) {
            random = new MutableLiveData<>();
        }
        pending.add(
                QodService.getInstance().random()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(quote -> random.setValue(quote))
        );
        return random;

    }
}