package edu.cnm.deepdive.beer_buddy;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity
public class HappyHour {

  private int happyhourid;

  private String barname;

  private int happyhourtime;


  @ColumnInfo(name = "id")
  public int getHappyhourid() {
    return happyhourid;
  }

  public void setHappyhourid(int happyhourid) {
    this.happyhourid = happyhourid;
  }

  @ColumnInfo(name = "name")
  public String getBarname() {
    return barname;
  }

  public void setBarname(String barname) {
    this.barname = barname;
  }

  public int getHappyhourtime() {
    return happyhourtime;
  }

  public void setHappyhourtime(int happyhourtime) {
    this.happyhourtime = happyhourtime;
  }
}
