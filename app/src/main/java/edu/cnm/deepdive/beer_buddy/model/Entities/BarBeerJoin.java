package edu.cnm.deepdive.beer_buddy.model.Entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@Entity(primaryKeys = {"beerId", "barId"},
    indices = {@Index("beerId"), @Index("barId")},
    foreignKeys = {
        @ForeignKey(entity = Beer.class,
            parentColumns = "id",
            childColumns = "beerId"),
        @ForeignKey(entity = Bar.class,
            parentColumns = "id",
            childColumns = "barId")
    })

public class BarBeerJoin {

  private long beerId;

  private long barId;


  public long getBeerId() {
    return beerId;
  }

  public void setBeerId(long beerId) {
    this.beerId = beerId;
  }

  public long getBarId() {
    return barId;
  }

  public void setBarId(long barId) {
    this.barId = barId;
  }
}
