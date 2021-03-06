// Generated by Dagger (https://dagger.dev).
package com.example.weatherapp.repository;

import com.example.weatherapp.api.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherRepository_Factory implements Factory<WeatherRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public WeatherRepository_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public WeatherRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static WeatherRepository_Factory create(Provider<ApiService> apiServiceProvider) {
    return new WeatherRepository_Factory(apiServiceProvider);
  }

  public static WeatherRepository newInstance(ApiService apiService) {
    return new WeatherRepository(apiService);
  }
}
