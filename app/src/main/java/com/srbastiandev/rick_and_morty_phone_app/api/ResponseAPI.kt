package com.srbastiandev.rick_and_morty_phone_app.api

import com.google.gson.annotations.SerializedName

data class ResponseAPI (
    var id : Int,
    var name: String,
    var status: String,
    @SerializedName("image") var characterImage: String
    )