package com.example.a26792.okhttp_test.gson;

import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Templates;

/**
 * Created by 26792 on 2018/1/26.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
