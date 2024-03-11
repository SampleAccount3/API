package com.example.api;

import com.google.gson.annotations.SerializedName;

public class TimeStamp {
    @SerializedName("valid")
    private String isValidTime;

    public String getIsValidTime() {
        return isValidTime;
    }
}
