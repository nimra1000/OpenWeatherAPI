package com.example.myweatherapp.model.repository

import com.example.myweatherapp.model.local.LocalWeatherForecast

interface WeatherForecastRepository {
    suspend fun getWeatherForecast(cityName: String ) : LocalWeatherForecast
}