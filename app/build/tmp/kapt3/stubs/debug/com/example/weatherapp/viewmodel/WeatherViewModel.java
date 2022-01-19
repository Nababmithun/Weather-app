package com.example.weatherapp.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/weatherapp/viewmodel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/weatherapp/repository/WeatherRepository;", "(Lcom/example/weatherapp/repository/WeatherRepository;)V", "_response", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/weatherapp/model/WeatherResponse;", "weatherWeatherResponse", "Landroidx/lifecycle/LiveData;", "getWeatherWeatherResponse", "()Landroidx/lifecycle/LiveData;", "getWeather", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.weatherapp.repository.WeatherRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.weatherapp.model.WeatherResponse> _response = null;
    
    @javax.inject.Inject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.repository.WeatherRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.weatherapp.model.WeatherResponse> getWeatherWeatherResponse() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getWeather() {
        return null;
    }
}