package com.example.myweatherapp.DI
import com.example.myweatherapp.model.api.WeatherForecastAPI
import com.example.myweatherapp.model.mapper.OpenWeatherForecastResponseMapper
import com.example.myweatherapp.model.mapper.WeatherForecastResponseMapper
import com.example.myweatherapp.model.repository.OpenWeatherForecastRepository
import com.example.myweatherapp.model.repository.WeatherForecastRepository
import com.example.myweatherapp.viewModel.WeatherForecastViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ApplicationComponent::class)
object WeatherForecastModule {

    @Provides
    fun provideWeatherForecastViewModelFactory(weatherForecastRepository: WeatherForecastRepository) : WeatherForecastViewModelFactory
            = WeatherForecastViewModelFactory(weatherForecastRepository) //plugged repo into view model

    @Provides
    fun provideWeatherForecastResponseMapper() : WeatherForecastResponseMapper = OpenWeatherForecastResponseMapper()

    @Provides
    fun provideWeatherForecastRepository(weatherForecastAPI: WeatherForecastAPI, mapper : WeatherForecastResponseMapper)
            : WeatherForecastRepository{
        return OpenWeatherForecastRepository(weatherForecastAPI, mapper)
    }

    @Provides
    fun provideWeatherForecastAPI() : WeatherForecastAPI = getWeatherForecastAPI()
    private fun getWeatherForecastAPI(): WeatherForecastAPI {
        val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }

        val client = OkHttpClient.Builder()
            .addInterceptor(logger)
            .build()

        val retrofit : Retrofit = Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org")
            .client(client)
            .addConverterFactory(GsonConverterFactory.create()) //this can be another library like moshi, jackson / map between json and classs
            .build()

        return retrofit
            .create(WeatherForecastAPI::class.java)
    }
}