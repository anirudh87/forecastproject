package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.test.project.BR;

public class Sys extends BaseObservable {

    private int type;

    private int id;

    private double message;

    private String country;

    private long sunrise;

    private long sunset;

    @Bindable
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
        notifyPropertyChanged(BR.type);
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
    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
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
    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
        notifyPropertyChanged(BR.sunrise);
    }

    @Bindable
    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
        notifyPropertyChanged(BR.sunset);
    }
}
