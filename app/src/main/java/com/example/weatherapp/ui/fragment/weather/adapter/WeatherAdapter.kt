package com.example.weatherapp.ui.fragment.weather.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.databinding.WeatherListLayoutBinding
import com.example.weatherapp.model.Listss
import com.example.weatherapp.ui.fragment.weather.WeatherRecylerviewFragmentDirections


class WeatherAdapter : RecyclerView.Adapter<WeatherAdapter.RecipeViewHolder>() {

    inner class RecipeViewHolder(val binding : WeatherListLayoutBinding):
        RecyclerView.ViewHolder(binding.root)


    private val diffCallback = object : DiffUtil.ItemCallback<Listss>(){
        override fun areItemsTheSame(oldItem: Listss, newItem: Listss): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Listss, newItem: Listss): Boolean {
            return oldItem == newItem
        }

    }
    private val differ = AsyncListDiffer(this,diffCallback)

    var weather:List<Listss>
        get() = differ.currentList
        set(value){
            differ.submitList(value)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(WeatherListLayoutBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        ))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val currdata=weather[position]
        val degreeSign = "\u00B0"
        holder.binding.apply {

            location.text=currdata.name
            val wdes: MutableList<String> = mutableListOf()
            for (ln in currdata.weather) {
                wdes.add(ln.main)
            }
            val celsius =Math.round(currdata.main.temp  - 273.15)
            overcast.text=wdes.toString()
            temperature.text="$celsius$degreeSign"+"C"
        }
        holder.itemView.setOnClickListener { mView->
            val direction = WeatherRecylerviewFragmentDirections
                .actionWeatherRecylerviewFragmentToDetailsFragment(currdata)
            mView.findNavController().navigate(direction)
        }
    }

    override fun getItemCount()=weather.size
}