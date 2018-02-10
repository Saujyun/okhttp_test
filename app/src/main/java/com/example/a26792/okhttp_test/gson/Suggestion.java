package com.example.a26792.okhttp_test.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 26792 on 2018/1/26.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public  Sport sport;
    public  class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public  String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
