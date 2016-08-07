package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.test.project.BR;

public class Location extends BaseObservable{

    private double lat;

    private double lon;

    @Bindable
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
        notifyPropertyChanged(BR.lat);
    }

    @Bindable
    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
        notifyPropertyChanged(BR.lon);
    }
}
