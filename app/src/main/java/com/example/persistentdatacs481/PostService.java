package com.example.persistentdatacs481;

import retrofit2.Call
import retrofit2.http.GET
public interface PostService {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}
