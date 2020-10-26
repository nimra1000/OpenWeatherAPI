package com.example.myweatherapp.model.network

import com.google.gson.annotations.SerializedName

data class City (
    @field:SerializedName("country")
    val country: String? = null,

    @field:SerializedName("coord")
    val coord: Coord? = null,

    @field:SerializedName("sunrise")
    val sunrise : Int? = null,

    @field:SerializedName("timezone")
    val timezone: Int? = null,

    @field:SerializedName("sunset")
    val sunset: Int? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @SerializedName("id")
    val id: Int? = null
)
