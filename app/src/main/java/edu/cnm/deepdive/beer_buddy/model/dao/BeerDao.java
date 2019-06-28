package edu.cnm.deepdive.beer_buddy.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.beer_buddy.model.entities.Bar;
import edu.cnm.deepdive.beer_buddy.model.entities.Beer;
import java.util.List;

@Dao
public interface BeerDao {

  @Insert
  long insert(Beer beer);

  @Query("SELECT * FROM bar")
  LiveData<List<Bar>> getAll();

}
