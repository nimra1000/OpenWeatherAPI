package com.example.myweatherapp.model.network

import com.google.gson.annotations.SerializedName

class Wind {
    @SerializedName("deg")
    val deg = 0

    @SerializedName("speed")
    val speed = 0.0

    override fun toString(): String {
        return "Wind{" +
                "deg = '" + deg + '\'' +
                ",speed = '" + speed + '\'' +
                "}"
    }
}