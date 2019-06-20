package edu.cnm.deepdive.beer_buddy.model.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import edu.cnm.deepdive.beer_buddy.model.Entities.Bar;
import edu.cnm.deepdive.beer_buddy.model.Entities.BarBeerJoin;
import edu.cnm.deepdive.beer_buddy.model.Entities.Beer;
import edu.cnm.deepdive.beer_buddy.model.dao.BarBeerJoinDao;
import edu.cnm.deepdive.beer_buddy.model.dao.BarDao;
import edu.cnm.deepdive.beer_buddy.model.dao.BeerDao;

@Database(entities = {Bar.class, Beer.class, BarBeerJoin.class},
    version = 1, exportSchema = true)
public abstract class BarDatabase extends RoomDatabase {

  public abstract BarDao getBarListingDao();

  public abstract BeerDao getBeerListingDao();

  public abstract BarBeerJoinDao barBeerJoinDao();


  private static BarDatabase INSTANCE;

  public static BarDatabase getInstance(Context context){
    if (INSTANCE == null){
        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
            BarDatabase.class, "bar_room").build();
    }
    return INSTANCE;
  }

}
