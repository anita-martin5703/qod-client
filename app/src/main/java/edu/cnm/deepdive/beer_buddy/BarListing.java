package edu.cnm.deepdive.beer_buddy;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = Entity.class,
            parentColumns = "bar_id",
            childColumns = "beer_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class BarListing {

  @ColumnInfo(name = "bar_id", index = true)
  private long barId;

  @ColumnInfo(name = "bar_name")
  private String barName;

  @ColumnInfo(name = "bar_status")
  private String barStatus;

  @ColumnInfo(name = "bar_street")
  private String barStreet;

  @ColumnInfo(name = "bar_state")
  private String barState;

  @ColumnInfo(name = "bar_zip")
  private int barZip;

  @ColumnInfo(name = "bar_phone_number")
  private int barPhoneNumber;



  public long getBarId() {
    return barId;
  }

  public void setBarId(int barId) {
    this.barId = barId;
  }

  public String getBarName() {
    return barName;
  }

  public void setBarName(String barName) {
    this.barName = barName;
  }

  public String getBarStatus() {
    return barStatus;
  }

  public void setBarStatus(String barStatus) {
    this.barStatus = barStatus;
  }

  public String getBarStreet() {
    return barStreet;
  }

  public void setBarStreet(String barStreet) {
    this.barStreet = barStreet;
  }

  public String getBarState() {
    return barState;
  }

  public void setBarState(String barState) {
    this.barState = barState;
  }

  public int getBarZip() {
    return barZip;
  }

  public void setBarZip(int barZip) {
    this.barZip = barZip;
  }

  public int getBarPhoneNumber() {
    return barPhoneNumber;
  }

  public void setBarPhoneNumber(int barPhoneNumber) {
    this.barPhoneNumber = barPhoneNumber;
  }
}
