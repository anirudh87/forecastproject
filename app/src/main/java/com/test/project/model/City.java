package com.test.project.model;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.test.project.BR;

public class City extends BaseObservable{

    private int id;

    private String name;

    private Location coord;

    private String country;

    private long population;

    private CitySys sys;

    private String cod;

    private double message;

    private int cnt;


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
    public Location getCoord() {
        return coord;
    }

    public void setCoord(Location coord) {
        this.coord = coord;
        notifyPropertyChanged(BR.coord);
    }

    @Bindable
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
        notifyPropertyChanged(BR.country);
    }

    @Bindable
    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
        notifyPropertyChanged(BR.population);
    }

    @Bindable
    public CitySys getSys() {
        return sys;
    }

    public void setSys(CitySys sys) {
        this.sys = sys;
        notifyPropertyChanged(BR.sys);
    }

    @Bindable
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
        notifyPropertyChanged(BR.cod);
    }

    @Bindable
    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
    }

    @Bindable
    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
        notifyPropertyChanged(BR.cnt);
    }
}
