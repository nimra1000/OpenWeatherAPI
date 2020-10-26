package com.example.myweatherapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.myweatherapp.R
import kotlinx.android.synthetic.main.activity_forecast.*
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getForecastButton.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToForecastFragment(viewCityName.text.toString())
            findNavController().navigate(action)
        }
    }
}