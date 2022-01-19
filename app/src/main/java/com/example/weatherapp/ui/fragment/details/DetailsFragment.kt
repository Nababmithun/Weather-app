package com.example.weatherapp.ui.fragment.details

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.fragment.navArgs
import com.example.weatherapp.R
import com.example.weatherapp.databinding.FragmentDetailsBinding
import com.example.weatherapp.model.Listss
import com.example.weatherapp.ui.WeatherActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class DetailsFragment : Fragment() {
    private var _binding : FragmentDetailsBinding?=null
    private val binding get()= _binding!!

    private val args: DetailsFragmentArgs by navArgs()
    private lateinit var listDetails: Listss

    private lateinit var notificationManager: NotificationManager
    private lateinit var notificationChannel: NotificationChannel
    private lateinit var builder: Notification.Builder
    private val channelId = "i.apps.notifications"
    private val description = "Test notification"




    private val callback = OnMapReadyCallback { googleMap ->

        val location = LatLng(listDetails.coord.lat, listDetails.coord.lon)
        googleMap.addMarker(MarkerOptions().position(location).title("Marker "))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(location))
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailsBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
        listDetails = args.details
        populateUI()
        setUpNoti()
    }

    private fun setUpNoti() {
        val degreeSign = "\u00B0"
        val celsius =Math.round(listDetails.main.temp  - 273.15)
        val pendingIntent = context?.let {
            NavDeepLinkBuilder(it)
                .setComponentName(WeatherActivity::class.java)
                .setGraph(R.navigation.nav_main)
                .setDestination(R.id.detailsFragment)
                .createPendingIntent()
        }


        notificationManager =
            context?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notificationChannel =
                NotificationChannel(channelId, description, NotificationManager.IMPORTANCE_HIGH)
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.GREEN
            notificationChannel.enableVibration(false)
            notificationManager.createNotificationChannel(notificationChannel)

            builder = Notification.Builder(requireContext(), channelId)
                .setContentTitle(listDetails.name)
                .setContentText(listDetails.main.temp.toString()+"$celsius$degreeSign"+"C")
                .setSmallIcon(R.drawable.weather)
                .setLargeIcon(
                    BitmapFactory.decodeResource(
                        this.resources,
                        R.drawable.weather
                    )
                )
                .setContentIntent(pendingIntent)
        } else {

            builder = Notification.Builder(requireContext())
                .setContentTitle(listDetails.name)
                .setContentText(listDetails.main.temp.toString()+"$celsius$degreeSign"+"C")
                .setSmallIcon(R.drawable.weather)
                .setLargeIcon(
                    BitmapFactory.decodeResource(
                        this.resources,
                        R.drawable.weather
                    )
                )
                .setContentIntent(pendingIntent)
        }
        notificationManager.notify(1234, builder.build())
    }



    private fun populateUI() {
        binding.apply {
            name.text = listDetails.name
            val degreeSign = "\u00B0"

            val wdes: MutableList<String> = mutableListOf()
            for (ln in listDetails.weather) {
                wdes.add(ln.main)
            }
            weatherdes.text =wdes.toString()

            weatherhumidity.text = listDetails.main.humidity.toString()
            weatherwindspeed.text = listDetails.main.pressure.toString()
            weathermaxtemp.text = listDetails.main.temp_max.toString()
            weathermintemp.text = listDetails.main.temp_min.toString()
            val celsius =Math.round(listDetails.main.temp  - 273.15)
            weathertemp.text = "$celsius$degreeSign"+"C"
            weathermaxtemp.text = "$celsius$degreeSign"+"C"
            weathermintemp.text = "$celsius$degreeSign"+"C"

        }
    }




}