package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.test.project.BR;


public class Rain extends BaseObservable {

    @SerializedName("1h")
    private float hour;

    @Bindable
    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
        notifyPropertyChanged(BR.hour);
    }
}
