package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.test.project.BR;

public class Wind extends BaseObservable {
    private float speed;
    private float deg;

    @Bindable
    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
        notifyPropertyChanged(BR.speed);
    }

    @Bindable
    public float getDeg() {
        return deg;
    }

    public void setDeg(float deg) {
        this.deg = deg;
        notifyPropertyChanged(BR.deg);
    }
}
