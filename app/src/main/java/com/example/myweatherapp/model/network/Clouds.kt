package com.example.myweatherapp.model.network

import com.google.gson.annotations.SerializedName

class Clouds {
    @SerializedName("all")
    val all = 0

    override fun toString(): String {
        return "Clouds{" +
                "all = '" + all + '\'' +
                "}"
    }
}