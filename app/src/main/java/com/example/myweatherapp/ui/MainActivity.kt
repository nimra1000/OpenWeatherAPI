package com.example.myweatherapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myweatherapp.ui.ForecastActivity
import com.example.myweatherapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Hi there")
        getForecastButton.setOnClickListener { getForecastForCity() }
    }

    private fun getForecastForCity() {
        val cityName = cityName.text.toString()
        startActivity(
            ForecastActivity.newInstance(
                this,
                cityName
            )
        )
    }


    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }
}
