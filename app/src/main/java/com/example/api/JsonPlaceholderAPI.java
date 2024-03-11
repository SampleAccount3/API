package com.example.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholderAPI {

    // Gets the posts request
    @GET("posts")
    // returns A list of Posts objects
    Call<List<Post>> getPosts();
}
