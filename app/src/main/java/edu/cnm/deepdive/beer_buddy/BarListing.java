package edu.cnm.deepdive.beer_buddy;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity
public class BarListing {

  private int barid;

  private String barname;

  private String barstatus;

  private String barstreet;

  private String barstate;

  private int barzip;

  private int barphonenumber;


  @ColumnInfo(name = "id")
  public int getBarid() {
    return barid;
  }

  public void setBarid(int barid) {
    this.barid = barid;
  }

  @ColumnInfo(name = "name")
  public String getBarname() {
    return barname;
  }

  public void setBarname(String barname) {
    this.barname = barname;
  }

  @ColumnInfo(name = "status")
  public String getBarstatus() {
    return barstatus;
  }

  public void setBarstatus(String barstatus) {
    this.barstatus = barstatus;
  }
  @ColumnInfo(name = "street")
  public String getBarstreet() {
    return barstreet;
  }

  public void setBarstreet(String barstreet) {
    this.barstreet = barstreet;
  }

  @ColumnInfo(name = "state")
  public String getBarstate() {
    return barstate;
  }

  public void setBarstate(String barstate) {
    this.barstate = barstate;
  }

  @ColumnInfo(name = "zip")
  public int getBarzip() {
    return barzip;
  }

  public void setBarzip(int barzip) {
    this.barzip = barzip;
  }

  @ColumnInfo(name = "phone")
  public int getBarphonenumber() {
    return barphonenumber;
  }

  public void setBarphonenumber(int barphonenumber) {
    this.barphonenumber = barphonenumber;
  }
}
