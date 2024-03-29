package edu.cnm.deepdive.beer_buddy.model.viewModel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import edu.cnm.deepdive.beer_buddy.model.database.BarDatabase;
import edu.cnm.deepdive.beer_buddy.model.entities.Bar;
import edu.cnm.deepdive.beer_buddy.model.entities.BarBeerJoin;
import edu.cnm.deepdive.beer_buddy.model.entities.Beer;
import java.util.List;

public class BarViewModel extends AndroidViewModel {

  private LiveData<List<Bar>> bars;
  private LiveData<List<Beer>> beers;


  public BarViewModel(@NonNull Application application) {
    super(application);
    BarDatabase db = BarDatabase.getInstance(application);
    bars = db.getBarListingDao().getAll();
    beers = db.getBeerListingDao().getAll();
  }

  public LiveData<List<Bar>> getBarsLiveData(){
    return bars;
  }

  public LiveData<List<Beer>> getBeerLiveData(){
    return beers;
  }

  public void addBars(final Bar bar){
    new Thread(new Runnable() {
      @Override
      public void run() {
        BarDatabase db = BarDatabase.getInstance(getApplication());
        db.getBarListingDao().insert(bar);
      }
    }).start();
  }

  public void addBeers (final Beer beer){
    new Thread(new Runnable() {
      @Override
      public void run() {
        BarDatabase db = BarDatabase.getInstance(getApplication());
        db.getBeerListingDao().insert(beer);
      }
    }).start();
  }

  public LiveData<Bar> getBar(Long id){
    BarDatabase db = BarDatabase.getInstance(getApplication());
    return db.getBarListingDao().findById(id);
  }

  public void AddNewBeerToBar(final Long barId, final Long id){
    new Thread(new Runnable() {
      @Override
      public void run() {
        BarBeerJoin barBeerJoin = new BarBeerJoin();
        barBeerJoin.setBarId(barId);
        barBeerJoin.setBeerId(id);
        BarDatabase.getInstance(getApplication()).barBeerJoinDao().insert(barBeerJoin);
      }
    }).start();
  }
}