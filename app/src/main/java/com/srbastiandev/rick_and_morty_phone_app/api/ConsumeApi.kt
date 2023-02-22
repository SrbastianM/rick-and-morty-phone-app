package com.srbastiandev.rick_and_morty_phone_app.api

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ConsumeApi {
    private fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/character")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}