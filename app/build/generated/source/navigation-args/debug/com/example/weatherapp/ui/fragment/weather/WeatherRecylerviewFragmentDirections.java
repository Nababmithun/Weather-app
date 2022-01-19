package com.example.weatherapp.ui.fragment.weather;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.weatherapp.R;
import com.example.weatherapp.model.Listss;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class WeatherRecylerviewFragmentDirections {
  private WeatherRecylerviewFragmentDirections() {
  }

  @NonNull
  public static ActionWeatherRecylerviewFragmentToDetailsFragment actionWeatherRecylerviewFragmentToDetailsFragment(
      @NonNull Listss details) {
    return new ActionWeatherRecylerviewFragmentToDetailsFragment(details);
  }

  public static class ActionWeatherRecylerviewFragmentToDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionWeatherRecylerviewFragmentToDetailsFragment(@NonNull Listss details) {
      if (details == null) {
        throw new IllegalArgumentException("Argument \"details\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("details", details);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionWeatherRecylerviewFragmentToDetailsFragment setDetails(@NonNull Listss details) {
      if (details == null) {
        throw new IllegalArgumentException("Argument \"details\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("details", details);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("details")) {
        Listss details = (Listss) arguments.get("details");
        if (Parcelable.class.isAssignableFrom(Listss.class) || details == null) {
          __result.putParcelable("details", Parcelable.class.cast(details));
        } else if (Serializable.class.isAssignableFrom(Listss.class)) {
          __result.putSerializable("details", Serializable.class.cast(details));
        } else {
          throw new UnsupportedOperationException(Listss.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_weatherRecylerviewFragment_to_detailsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Listss getDetails() {
      return (Listss) arguments.get("details");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionWeatherRecylerviewFragmentToDetailsFragment that = (ActionWeatherRecylerviewFragmentToDetailsFragment) object;
      if (arguments.containsKey("details") != that.arguments.containsKey("details")) {
        return false;
      }
      if (getDetails() != null ? !getDetails().equals(that.getDetails()) : that.getDetails() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getDetails() != null ? getDetails().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionWeatherRecylerviewFragmentToDetailsFragment(actionId=" + getActionId() + "){"
          + "details=" + getDetails()
          + "}";
    }
  }
}
