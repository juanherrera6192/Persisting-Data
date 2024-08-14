package com.example.persistentdatacs481;

public class PostRepositoryImpl (
    private val postService: PostService,
    private val postDao: PostDao,
    private val postMapper: PostMapper,
    private val executor: Executor
) : PostRepository {
    ovveride fun getPosts(): LiveData<Result> {
        val result = MutableLiveData<Result>()
        result.postValue(Result.Loading)
        postService.getPosts().enqueue(object : Callback<List<Post>> {
            ovveride fun onFailure(call: Call<List<Post>>, response: Response<List>)
        })
        }
        }
