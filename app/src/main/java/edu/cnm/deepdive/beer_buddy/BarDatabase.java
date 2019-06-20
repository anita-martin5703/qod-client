package edu.cnm.deepdive.beer_buddy;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {BarListing.class, BeerListing.class, needclass.class},
    version = 1, exportSchema = true)
public abstract class BarDatabase extends RoomDatabase {


  private static BarDatabase INSTANCE;

  public static BarDatabase getInstance(Context context){
    if (INSTANCE == null){
        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
            BarDatabase.class, "bar_list").build();
    }
    return INSTANCE;
  }

}
