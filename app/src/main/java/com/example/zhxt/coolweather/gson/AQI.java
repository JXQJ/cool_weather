package com.example.zhxt.coolweather.gson;

/**
 * Created by zhxt on 2018/1/31.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
