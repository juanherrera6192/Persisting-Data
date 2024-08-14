package com.example.persistentdatacs481;
import com.google.gson.annotations.SerializedName
data class Post(
    @SerializedName("id") val id: Long,
    @SerializedName("userId") val userID: Long,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String
)