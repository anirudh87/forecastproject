package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.test.project.BR;

public class CitySys extends BaseObservable{

    private long population;

    @Bindable
    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
        notifyPropertyChanged(BR.population);
    }
}
