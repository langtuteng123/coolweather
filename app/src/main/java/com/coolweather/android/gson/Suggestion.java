package com.coolweather.android.gson;

/**
 * Created by lil78 on 2018/5/16.
 */
import com.google.gson.annotations.SerializedName;
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public class Comfort {
        @SerializedName("txt")
        public String info;
    }
    public class CarWash {
        @SerializedName("txt")
        public String info;

    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}