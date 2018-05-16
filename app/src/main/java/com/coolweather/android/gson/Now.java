package com.coolweather.android.gson;

/**
 * Created by lil78 on 2018/5/16.
 */
import com.google.gson.annotations.SerializedName;
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
