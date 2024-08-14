package com.example.persistentdatacs481;

public interface PostRepository {

    fun getPosts(): LiveData<Result>
}
