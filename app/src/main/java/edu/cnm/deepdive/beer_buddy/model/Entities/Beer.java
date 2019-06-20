package edu.cnm.deepdive.beer_buddy.model.Entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = Bar.class,
            parentColumns = "id",
            childColumns = "id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
  public class Beer {

  @PrimaryKey(autoGenerate = true)
  private long id;

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
