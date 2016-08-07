package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.test.project.BR;

import java.util.List;

public class CurrentData extends BaseObservable {

    private Location coord;

    private List<Weather> weather;

    private String base;

    private WeatherData main;

    private Wind wind;

    private Rain rain;

    private Clouds clouds;

    private long dt;

    private Sys sys;

    private int id;

    private String name;

    private int cod;

    @Bindable
    public Location getCoord() {
        return coord;
    }

    public void setCoord(Location coord) {
        this.coord = coord;
        notifyPropertyChanged(BR.coord);
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
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
        notifyPropertyChanged(BR.base);
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
    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
        notifyPropertyChanged(BR.clouds);
    }

    @Bindable
    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
        notifyPropertyChanged(BR.dt);
    }

    @Bindable
    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
        notifyPropertyChanged(BR.sys);
    }

    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
        notifyPropertyChanged(BR.cod);
    }
}
