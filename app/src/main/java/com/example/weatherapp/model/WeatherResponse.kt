package com.example.weatherapp.model

data class WeatherResponse(
    val cod: String,
    val count: Int,
    val list: List<Listss>,
    val message: String
)