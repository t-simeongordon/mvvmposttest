package com.example.terrelsimeon_gordon.mvvmposttest.network

import com.example.terrelsimeon_gordon.mvvmposttest.model.Post
import retrofit2.http.GET
//import java.util.*
import io.reactivex.Observable

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}