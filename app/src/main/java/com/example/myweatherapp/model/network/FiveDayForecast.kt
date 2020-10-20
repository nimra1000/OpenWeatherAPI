package com.example.myweatherapp.model.network

import com.google.gson.annotations.SerializedName

class FiveDayForecast {
    @SerializedName("city")
    val city: City? = null

    @SerializedName("cnt")
    val cnt = 0

    @SerializedName("cod")
    val cod: String? = null

    @SerializedName("message")
    val message = 0

    @SerializedName("list")
    val list: List<ListItem>? =
        null

    override fun toString(): String {
        return "FiveDayForecast{" +
                "city = '" + city + '\'' +
                ",cnt = '" + cnt + '\'' +
                ",cod = '" + cod + '\'' +
                ",message = '" + message + '\'' +
                ",list = '" + list + '\'' +
                "}"
    }
}