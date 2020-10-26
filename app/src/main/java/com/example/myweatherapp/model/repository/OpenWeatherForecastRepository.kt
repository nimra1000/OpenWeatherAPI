package com.example.myweatherapp.model.repository

import com.example.myweatherapp.model.api.WeatherForecastAPI
import com.example.myweatherapp.model.local.LocalWeatherForecast
import com.example.myweatherapp.model.mapper.WeatherForecastResponseMapper

class OpenWeatherForecastRepository(
    val weatherForecastAPI: WeatherForecastAPI,
    val mapper: WeatherForecastResponseMapper
) : WeatherForecastRepository {
    override suspend fun getWeatherForecast(cityName: String): LocalWeatherForecast {
        val networkResponse = weatherForecastAPI.getWeatherForecast(cityName, appId = "08ea73b8342bf2d4e982ed05a24deae6", units = "metric")
        return mapper.map(networkResponse)
    }
}