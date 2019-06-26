package edu.cnm.deepdive.beer_buddy;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class BarApplication extends Application {

  @Override
  public void onCreate(){
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }

}
