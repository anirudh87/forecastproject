package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.test.project.BR;

import java.io.Serializable;

public class ForecastSys extends BaseObservable {

    private String pod;

    @Bindable
    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
        notifyPropertyChanged(BR.pod);
    }
}
