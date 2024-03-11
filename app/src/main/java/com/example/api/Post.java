package com.example.api;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userID;
    private int id;
    private String title;

    // You can use the @SerialiedName if you want to have a different name for the json Object Field
    @SerializedName("body")
    private String text;

    public int getUserID() {
        return userID;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
