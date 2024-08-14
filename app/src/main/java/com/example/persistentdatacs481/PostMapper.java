package com.example.persistentdatacs481;

public class PostMapper {
    fun serviceToEntity(post: Post): PostEntity {
        return PostEntity(post.id, post.userId, post.title, post.body)
    }

    fun serviceToUi(post: Post): UiPost {
        return UiPost(post.title, post,body)
    }
}
