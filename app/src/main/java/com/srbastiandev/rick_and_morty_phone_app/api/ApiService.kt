package com.srbastiandev.rick_and_morty_phone_app.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    // This interface create the method were we can consume the API
    @GET
    fun getCharactersById(@Url url:String) : Response<ResponseAPI>
}