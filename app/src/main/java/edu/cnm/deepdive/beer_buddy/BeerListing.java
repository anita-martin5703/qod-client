package edu.cnm.deepdive.beer_buddy;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = Entity.class,
            parentColumns = " ",
            childColumns = " ",
            onDelete = ForeignKey.CASCADE
        )
    }
)
  public class BeerListing {

  @ColumnInfo(name = "id", index = true)
  private long id;

  @ColumnInfo(name = "name")
  private String name;



  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
