package com.example.weatherapp.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u000b\u0010\u0002\u001a\u00070\u0003\u00a2\u0006\u0002\b\u0004\u0012\u000b\u0010\u0005\u001a\u00070\u0006\u00a2\u0006\u0002\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000b\u0010\n\u001a\u00070\u000b\u00a2\u0006\u0002\b\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000b\u0010\u000e\u001a\u00070\u000f\u00a2\u0006\u0002\b\u0004\u0012\u000b\u0010\u0010\u001a\u00070\u000f\u00a2\u0006\u0002\b\u0004\u0012\u000b\u0010\u0011\u001a\u00070\u0012\u00a2\u0006\u0002\b\u0004\u0012\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0002\b\u0004\u0012\u000b\u0010\u0016\u001a\u00070\u0017\u00a2\u0006\u0002\b\u0004\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010-\u001a\u00070\u0003\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\u0014\u0010.\u001a\r\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\u000e\u0010/\u001a\u00070\u0017\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\u000e\u00100\u001a\u00070\u0006\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\t\u00101\u001a\u00020\bH\u00c6\u0003J\t\u00102\u001a\u00020\bH\u00c6\u0003J\u000e\u00103\u001a\u00070\u000b\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\t\u00104\u001a\u00020\rH\u00c6\u0003J\u000e\u00105\u001a\u00070\u000f\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\u000e\u00106\u001a\u00070\u000f\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\u000e\u00107\u001a\u00070\u0012\u00a2\u0006\u0002\b\u0004H\u00c6\u0003J\u00a5\u0001\u00108\u001a\u00020\u00002\r\b\u0002\u0010\u0002\u001a\u00070\u0003\u00a2\u0006\u0002\b\u00042\r\b\u0002\u0010\u0005\u001a\u00070\u0006\u00a2\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\r\b\u0002\u0010\n\u001a\u00070\u000b\u00a2\u0006\u0002\b\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\r\b\u0002\u0010\u000e\u001a\u00070\u000f\u00a2\u0006\u0002\b\u00042\r\b\u0002\u0010\u0010\u001a\u00070\u000f\u00a2\u0006\u0002\b\u00042\r\b\u0002\u0010\u0011\u001a\u00070\u0012\u00a2\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0002\b\u00042\r\b\u0002\u0010\u0016\u001a\u00070\u0017\u00a2\u0006\u0002\b\u0004H\u00c6\u0001J\t\u00109\u001a\u00020\bH\u00d6\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010=\u001a\u00020\bH\u00d6\u0001J\t\u0010>\u001a\u00020\rH\u00d6\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00070\u0003\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00070\u0006\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\n\u001a\u00070\u000b\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u00070\u000f\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0010\u001a\u00070\u000f\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\u0011\u001a\u00070\u0012\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u001c\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0016\u001a\u00070\u0017\u00a2\u0006\u0002\b\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,\u00a8\u0006D"}, d2 = {"Lcom/example/weatherapp/model/Listss;", "Landroid/os/Parcelable;", "clouds", "Lcom/example/weatherapp/model/Clouds;", "Lkotlinx/parcelize/RawValue;", "coord", "Lcom/example/weatherapp/model/Coord;", "dt", "", "id", "main", "Lcom/example/weatherapp/model/Main;", "name", "", "rain", "", "snow", "sys", "Lcom/example/weatherapp/model/Sys;", "weather", "", "Lcom/example/weatherapp/model/Weather;", "wind", "Lcom/example/weatherapp/model/Wind;", "(Lcom/example/weatherapp/model/Clouds;Lcom/example/weatherapp/model/Coord;IILcom/example/weatherapp/model/Main;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/example/weatherapp/model/Sys;Ljava/util/List;Lcom/example/weatherapp/model/Wind;)V", "getClouds", "()Lcom/example/weatherapp/model/Clouds;", "getCoord", "()Lcom/example/weatherapp/model/Coord;", "getDt", "()I", "getId", "getMain", "()Lcom/example/weatherapp/model/Main;", "getName", "()Ljava/lang/String;", "getRain", "()Ljava/lang/Object;", "getSnow", "getSys", "()Lcom/example/weatherapp/model/Sys;", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/example/weatherapp/model/Wind;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Listss implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final com.example.weatherapp.model.Clouds clouds = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.weatherapp.model.Coord coord = null;
    private final int dt = 0;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.weatherapp.model.Main main = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object rain = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object snow = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.weatherapp.model.Sys sys = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.weatherapp.model.Weather> weather = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.weatherapp.model.Wind wind = null;
    public static final android.os.Parcelable.Creator<com.example.weatherapp.model.Listss> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Listss copy(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.model.Clouds clouds, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.model.Coord coord, int dt, int id, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.model.Main main, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Object rain, @org.jetbrains.annotations.NotNull()
    java.lang.Object snow, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.model.Sys sys, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weatherapp.model.Weather> weather, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.model.Wind wind) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Listss(@org.jetbrains.annotations.NotNull()
    com.example.weatherapp.model.Clouds clouds, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.model.Coord coord, int dt, int id, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.model.Main main, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Object rain, @org.jetbrains.annotations.NotNull()
    java.lang.Object snow, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.model.Sys sys, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.weatherapp.model.Weather> weather, @org.jetbrains.annotations.NotNull()
    com.example.weatherapp.model.Wind wind) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Clouds component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Clouds getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Coord component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Coord getCoord() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getDt() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Main component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSnow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Sys component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Sys getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weatherapp.model.Weather> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.weatherapp.model.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Wind component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.weatherapp.model.Wind getWind() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.weatherapp.model.Listss> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.weatherapp.model.Listss createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.weatherapp.model.Listss[] newArray(int size) {
            return null;
        }
    }
}