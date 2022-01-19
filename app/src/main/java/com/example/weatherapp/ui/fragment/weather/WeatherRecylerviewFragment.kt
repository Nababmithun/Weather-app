package com.example.weatherapp.ui.fragment.weather

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.databinding.FragmentWeatherRecylerviewBinding
import com.example.weatherapp.ui.fragment.weather.adapter.WeatherAdapter
import com.example.weatherapp.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class WeatherRecylerviewFragment : Fragment() {

    private var _binding: FragmentWeatherRecylerviewBinding? = null
    private val binding get() = _binding!!
    private val viewModel: WeatherViewModel by activityViewModels()
    private lateinit var weatherAdater: WeatherAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWeatherRecylerviewBinding.inflate(inflater, container, false)
        val view = binding.root


        setUpRv()
        return view
    }


    private fun setUpRv() {
        weatherAdater = WeatherAdapter()

        binding.recyclerViewWeather.apply {
            adapter = weatherAdater
            layoutManager = LinearLayoutManager(
                requireContext()

            )
            setHasFixedSize(true)
        }

        viewModel.weatherWeatherResponse.observe(viewLifecycleOwner, { listTvShows ->

            weatherAdater.weather = listTvShows.list
            Log.d("body", listTvShows.toString())

        })

    }





}