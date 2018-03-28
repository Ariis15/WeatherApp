package com.example.riis.weather;

/**
 * Created by riis on 3/28/18.
 */



        import android.app.Activity;
        import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "Svendborg, DK");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }

}