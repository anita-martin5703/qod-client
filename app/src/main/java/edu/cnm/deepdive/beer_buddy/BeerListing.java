package edu.cnm.deepdive.beer_buddy;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

  @Entity
  public class BeerListing {

  private int id;

  private String name;


  @ColumnInfo(name = "id")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @ColumnInfo(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
