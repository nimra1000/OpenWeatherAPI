package com.example.myweatherapp.model.network

import com.google.gson.annotations.SerializedName

class Coord {
    @SerializedName("lon")
    val lon = 0.0

    @SerializedName("lat")
    val lat = 0.0

    override fun toString(): String {
        return "Coord{" +
                "lon = '" + lon + '\'' +
                ",lat = '" + lat + '\'' +
                "}"
    }
}