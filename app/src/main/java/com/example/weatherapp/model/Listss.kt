package com.example.weatherapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class Listss(
    val clouds: @RawValue Clouds,
    val coord: @RawValue Coord,
    val dt: Int,
    val id: Int,
    val main: @RawValue Main,
    val name: String,
    val rain:@RawValue Any,
    val snow:@RawValue Any,
    val sys:@RawValue Sys,
    val weather:@RawValue List<Weather>,
    val wind:@RawValue Wind
) : Parcelable