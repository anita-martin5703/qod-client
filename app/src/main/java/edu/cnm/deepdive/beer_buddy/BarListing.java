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
public class BarListing {

  @ColumnInfo(name = "id", index = true)
  private long id;

  @ColumnInfo(name = "name")
  private String name;

  @ColumnInfo(name = "status")
  private String status;

  @ColumnInfo(name = "street")
  private String street;

  @ColumnInfo(name = "state")
  private String state;

  @ColumnInfo(name = "zip")
  private int zip;

  @ColumnInfo(name = "number")
  private int number;



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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getZip() {
    return zip;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }

  public int getBarPhoneNumber() {
    return number;
  }

  public void setBarPhoneNumber(int barPhoneNumber) {
    this.number = barPhoneNumber;
  }
}
