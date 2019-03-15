package com.example.myapplication.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import com.example.myapplication.model.Datas;
import com.example.myapplication.model.Newsfeeditem;

public class GSONNews {

    @SerializedName("loadmore_parameter")
    @Expose
    public String loadmoreParameter;
    @SerializedName("datas")
    @Expose
    public Datas datas;

}