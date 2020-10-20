package com.example.myweatherapp.model.network

import com.google.gson.annotations.SerializedName

class City {
    @SerializedName("country")
    val country: String? = null

    @SerializedName("coord")
    val coord: Coord? = null

    @SerializedName("sunrise")
    val sunrise = 0

    @SerializedName("timezone")
    val timezone = 0

    @SerializedName("sunset")
    val sunset = 0

    @SerializedName("name")
    val name: String? = null

    @SerializedName("id")
    val id = 0

    @SerializedName("population")
    val population = 0

    override fun toString(): String {
        return "City{" +
                "country = '" + country + '\'' +
                ",coord = '" + coord + '\'' +
                ",sunrise = '" + sunrise + '\'' +
                ",timezone = '" + timezone + '\'' +
                ",sunset = '" + sunset + '\'' +
                ",name = '" + name + '\'' +
                ",id = '" + id + '\'' +
                ",population = '" + population + '\'' +
                "}"
    }
}