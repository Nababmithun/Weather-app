package com.example.weatherapp.api


import com.example.weatherapp.utils.Constants.END_URL
import com.example.weatherapp.model.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(END_URL)
    suspend fun getWeather(): Response<WeatherResponse>

}