// Generated by Dagger (https://dagger.dev).
package com.example.weatherapp.viewmodel;

import com.example.weatherapp.repository.WeatherRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherViewModel_Factory implements Factory<WeatherViewModel> {
  private final Provider<WeatherRepository> repositoryProvider;

  public WeatherViewModel_Factory(Provider<WeatherRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public WeatherViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static WeatherViewModel_Factory create(Provider<WeatherRepository> repositoryProvider) {
    return new WeatherViewModel_Factory(repositoryProvider);
  }

  public static WeatherViewModel newInstance(WeatherRepository repository) {
    return new WeatherViewModel(repository);
  }
}