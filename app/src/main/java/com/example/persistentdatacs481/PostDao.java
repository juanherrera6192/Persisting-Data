package com.example.persistentdatacs481;
@Dao

public interface PostDao {
    @Insert(onConflict = OnConflictStraregy.REPLACE)
    fun insertPosts(posts: List<PostEntity>)

    @Qeury("SELECT * FROM posts")
    fun loadPosts(): LiveData<List<PostEntity>>
}
