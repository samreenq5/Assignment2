package com.university.app.api

import retrofit2.http.GET
import retrofit2.http.Query

interface LoginApi {

    @GET("api/login")
    suspend fun login(@Query("username") username: String, @Query("password") password: String): LoginResponse
}