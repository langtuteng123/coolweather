package com.coolweather.android.gson;

/**
 * Created by lil78 on 2018/5/16.
 */
import com.google.gson.annotations.SerializedName;
public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
