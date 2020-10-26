package com.example.myweatherapp.model.network

import com.google.gson.annotations.SerializedName


data class WeatherItem (
    @field:SerializedName("icon")
    val icon: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("main")
    val main: String? = null,

    @SerializedName("id")
    val id: Int? = 0
)