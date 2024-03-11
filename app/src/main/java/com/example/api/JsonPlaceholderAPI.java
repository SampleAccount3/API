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
    Call<List<Post>> getPosts();

    @GET("posts")
    // having a ? means the start of the query, & meaning adding new query
    Call<List<Post>> getPosts2(
            @Query("userId") int userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    @GET("http://192.168.1.62:88/Wilcon.TSSS.Tablet/Request.aspx?function=validatetimestamp&unix=1709608596")
    Call<TimeStamp> getResult(
//            @Query("secs") int seconds
    );



    // having a {bracket} in @GET can make your get request dynamically
    @GET("/posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);
}
