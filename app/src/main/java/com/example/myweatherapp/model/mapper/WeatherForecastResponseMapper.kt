package com.example.myweatherapp.model.mapper

import com.example.myweatherapp.model.local.LocalWeatherForecast
import com.example.myweatherapp.model.network.FiveDayForecast

interface WeatherForecastResponseMapper {
    //connect  network data from api to local to display how we want it
    fun map(networkResponse: FiveDayForecast) : LocalWeatherForecast
}