package edu.cnm.deepdive.beer_buddy.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.beer_buddy.model.Entities.BarBeerJoin;
import edu.cnm.deepdive.beer_buddy.model.Entities.Beer;
import java.util.List;

@Dao
public interface BarBeerJoinDao {

  @Insert
  void insert (BarBeerJoin barBeerJoin);

  @Query("SELECT beer.* FROM beer INNER JOIN BarBeerJoin ON " +
      "Beer.id = BarBeerJoin.beer_id WHERE " +
      "BarBeerJoin.bar_id = :barId")
  LiveData<List<Beer>> barBeerJoinTable (long barId);

}