package com.example.myweatherapp.model.local

data class LocalWeatherForecast(
    val city: String?,

    val country: String?,

    val list: List<LocalWeatherItem>?
)
