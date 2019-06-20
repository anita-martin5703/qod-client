package edu.cnm.deepdive.beer_buddy;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = Entity.class,
            parentColumns = "beer_id",
            childColumns = "bar_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
  public class BeerListing {

  @ColumnInfo(name = "beer_id", index = true)
  private long beerId;

  @ColumnInfo(name = "beer_name")
  private String beerName;



  public long getBeerId() {
    return beerId;
  }

  public void setBeerId(int beerId) {
    this.beerId = beerId;
  }

  public String getBeerName() {
    return beerName;
  }

  public void setBeerName(String beerName) {
    this.beerName = beerName;
  }
}
