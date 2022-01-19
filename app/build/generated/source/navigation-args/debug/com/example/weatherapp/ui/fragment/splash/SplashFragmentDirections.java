package com.example.weatherapp.ui.fragment.splash;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.weatherapp.R;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSplashFragmentToWeatherRecylerviewFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_weatherRecylerviewFragment);
  }
}
