package com.example.myweatherapp.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myweatherapp.R
import kotlinx.android.synthetic.main.activity_forecast.*


class ForecastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)
        val cityName = intent.getStringExtra(EXTRA_MESSAGE)
        viewCityName.text = cityName
    }

    companion object {
        @JvmStatic
        fun newInstance(context: Context?, cityName: String): Intent {
            return Intent(context, ForecastActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, cityName)
            }
        }

        private const val EXTRA_MESSAGE = "CITY NAME"

        @JvmField
        val TAG = ForecastActivity::class.java.simpleName
    }
}








