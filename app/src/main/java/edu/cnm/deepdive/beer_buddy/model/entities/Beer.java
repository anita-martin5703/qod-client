package edu.cnm.deepdive.beer_buddy.model.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
  public class Beer {

  @PrimaryKey(autoGenerate = true)
  private long id;
  @ColumnInfo(name = "beer_id", index = true)
  private long beerId;
  private String name;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getBeerId() {
    return beerId;
  }

  public void setBeerId(long beerId) {
    this.beerId = beerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
