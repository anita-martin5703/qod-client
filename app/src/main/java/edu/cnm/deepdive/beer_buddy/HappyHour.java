package edu.cnm.deepdive.beer_buddy;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = Entity.class,
            parentColumns = "happy_hour_id",
            childColumns = "beer_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class HappyHour {

  @ColumnInfo(name = "happy_hour_id", index = true)
  private long happyhourId;

  @ColumnInfo(name = "bar_name")
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
