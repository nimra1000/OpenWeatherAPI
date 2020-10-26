package com.example.myweatherapp.model.api

import com.example.myweatherapp.model.network.FiveDayForecast
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherForecastAPI {
    //fun getWeatherForecast(cityName: String) : FiveDayForecast

    @GET("/data/2.5/forecast?")
    suspend fun getWeatherForecast(
        @Query("q")city : String,
        @Query("appid") appId: String,
        @Query("units") units: String
    ) : FiveDayForecast
}