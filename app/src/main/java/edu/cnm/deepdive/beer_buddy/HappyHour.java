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
public class HappyHour {

  @ColumnInfo(name = "id", index = true)
  private long happyhourId;

  @ColumnInfo(name = "name")
  private String barName;

  private int happyhourtime;



  public long getHappyhourId() {
    return happyhourId;
  }

  public void setHappyhourId(int happyhourId) {
    this.happyhourId = happyhourId;
  }

  public String getBarName() {
    return barName;
  }

  public void setBarName(String barName) {
    this.barName = barName;
  }

  public int getHappyhourtime() {
    return happyhourtime;
  }

  public void setHappyhourtime(int happyhourtime) {
    this.happyhourtime = happyhourtime;
  }
}
