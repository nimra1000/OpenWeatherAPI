package com.example.myweatherapp.model.network

import com.google.gson.annotations.SerializedName

class Main {
    @SerializedName("temp")
    val temp = 0.0

    @SerializedName("temp_min")
    val tempMin = 0.0

    @SerializedName("grnd_level")
    val grndLevel = 0

    @SerializedName("temp_kf")
    val tempKf = 0.0

    @SerializedName("humidity")
    val humidity = 0

    @SerializedName("pressure")
    val pressure = 0

    @SerializedName("sea_level")
    val seaLevel = 0

    @SerializedName("feels_like")
    val feelsLike = 0.0

    @SerializedName("temp_max")
    val tempMax = 0.0

    override fun toString(): String {
        return "Main{" +
                "temp = '" + temp + '\'' +
                ",temp_min = '" + tempMin + '\'' +
                ",grnd_level = '" + grndLevel + '\'' +
                ",temp_kf = '" + tempKf + '\'' +
                ",humidity = '" + humidity + '\'' +
                ",pressure = '" + pressure + '\'' +
                ",sea_level = '" + seaLevel + '\'' +
                ",feels_like = '" + feelsLike + '\'' +
                ",temp_max = '" + tempMax + '\'' +
                "}"
    }
}