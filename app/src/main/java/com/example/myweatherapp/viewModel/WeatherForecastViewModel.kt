import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.myweatherapp.model.repository.WeatherForecastRepository
import com.example.myweatherapp.viewModel.Resource
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import javax.inject.Inject

class WeatherForecastViewModel @Inject constructor(
    private val weatherRepository: WeatherForecastRepository
) : ViewModel() {

    fun getWeatherForecast(cityName: String) = liveData(context = Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = weatherRepository.getWeatherForecast(cityName)))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Unknown error"))
        }
    }

}
