package com.example.zhxt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhxt on 2018/1/31.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
