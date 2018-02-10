package com.example.a26792.okhttp_test.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 26792 on 2018/1/26.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
