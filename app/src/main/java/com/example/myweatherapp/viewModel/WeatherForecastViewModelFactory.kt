package com.example.myweatherapp.viewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myweatherapp.model.repository.WeatherForecastRepository

class WeatherForecastViewModelFactory(
    private val repository: WeatherForecastRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        require(modelClass.isAssignableFrom(WeatherForecastViewModel::class.java)) {
            "Unknown Viewmodel class " + modelClass.simpleName + ", ViewModel class should be assignable from WeatherForecastViewModel"
        }
        return WeatherForecastViewModel(repository) as T
    }
}
