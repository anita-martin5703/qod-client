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

  @Query("SELECT * FROM beer INNER JOIN BarBeerJoin ON " +
      "Beer.id = BarBeerJoin.barId WHERE " +
      "BarBeerJoin.beerId = :beerId")
  LiveData<List<Beer>> barBeerjointable (long beerId);

}