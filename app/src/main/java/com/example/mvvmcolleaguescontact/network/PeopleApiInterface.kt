package com.example.mvvmcolleaguescontact.network

import com.example.mvvmcolleaguescontact.model.PeopleResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PeopleApiInterface {
    @GET("api/v1/people")
    suspend fun getPeopleResponse(
        @Query("avatar") avatar: String,
        @Query("firstName") firstName: String,
        @Query("lastName") lastName: String,
        @Query("email") email: String,
        @Query("jobTitle") jobTitle: String
    ) : Response<PeopleResponse>
}