package com.example.myweatherapp.model.network

import com.google.gson.annotations.SerializedName

class WeatherItem {
    @SerializedName("icon")
    val icon: String? = null

    @SerializedName("description")
    val description: String? = null

    @SerializedName("main")
    val main: String? = null

    @SerializedName("id")
    val id = 0

    override fun toString(): String {
        return "WeatherItem{" +
                "icon = '" + icon + '\'' +
                ",description = '" + description + '\'' +
                ",main = '" + main + '\'' +
                ",id = '" + id + '\'' +
                "}"
    }
}