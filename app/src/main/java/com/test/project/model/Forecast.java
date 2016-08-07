package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.test.project.BR;

import java.util.List;

public class Forecast extends BaseObservable{

    private long dt;

    private WeatherData main;

    private List<Weather> weather;

    private Clouds clouds;

    private Wind wind;

    private Rain rain;

    private ForecastSys sys;

    private String dt_txt;

    @Bindable
    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
        notifyPropertyChanged(BR.dt);
    }

    @Bindable
    public WeatherData getMain() {
        return main;
    }

    public void setMain(WeatherData main) {
        this.main = main;
        notifyPropertyChanged(BR.main);
    }

    @Bindable
    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
        notifyPropertyChanged(BR.weather);
    }

    @Bindable
    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
        notifyPropertyChanged(BR.clouds);
    }

    @Bindable
    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
        notifyPropertyChanged(BR.wind);
    }

    @Bindable
    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
        notifyPropertyChanged(BR.rain);
    }

    @Bindable
    public ForecastSys getSys() {
        return sys;
    }

    public void setSys(ForecastSys sys) {
        this.sys = sys;
        notifyPropertyChanged(BR.sys);
    }

    @Bindable
    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
        notifyPropertyChanged(BR.dt_txt);
    }
}
