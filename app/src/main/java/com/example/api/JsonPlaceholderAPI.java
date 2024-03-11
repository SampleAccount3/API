package com.example.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceholderAPI {

    // Gets the posts request
    @GET("posts")
    // returns A list of Posts objects
    Call<List<Post>> getPosts(@Query("userId") int userId);

    // having a {bracket} in @GET can make your get request dynamically
    @GET("/posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);
}
