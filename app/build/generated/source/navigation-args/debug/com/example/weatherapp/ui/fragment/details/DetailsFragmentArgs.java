package com.example.weatherapp.ui.fragment.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.weatherapp.model.Listss;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailsFragmentArgs __result = new DetailsFragmentArgs();
    bundle.setClassLoader(DetailsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("details")) {
      Listss details;
      if (Parcelable.class.isAssignableFrom(Listss.class) || Serializable.class.isAssignableFrom(Listss.class)) {
        details = (Listss) bundle.get("details");
      } else {
        throw new UnsupportedOperationException(Listss.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (details == null) {
        throw new IllegalArgumentException("Argument \"details\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("details", details);
    } else {
      throw new IllegalArgumentException("Required argument \"details\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Listss getDetails() {
    return (Listss) arguments.get("details");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailsFragmentArgs that = (DetailsFragmentArgs) object;
    if (arguments.containsKey("details") != that.arguments.containsKey("details")) {
      return false;
    }
    if (getDetails() != null ? !getDetails().equals(that.getDetails()) : that.getDetails() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getDetails() != null ? getDetails().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailsFragmentArgs{"
        + "details=" + getDetails()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(DetailsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Listss details) {
      if (details == null) {
        throw new IllegalArgumentException("Argument \"details\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("details", details);
    }

    @NonNull
    public DetailsFragmentArgs build() {
      DetailsFragmentArgs result = new DetailsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setDetails(@NonNull Listss details) {
      if (details == null) {
        throw new IllegalArgumentException("Argument \"details\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("details", details);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Listss getDetails() {
      return (Listss) arguments.get("details");
    }
  }
}
