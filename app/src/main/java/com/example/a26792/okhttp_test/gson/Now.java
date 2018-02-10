package com.example.a26792.okhttp_test.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 26792 on 2018/1/26.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public  class  More{
        @SerializedName("txt")
        public String info;
    }}
