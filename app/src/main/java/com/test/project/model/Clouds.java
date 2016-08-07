package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.test.project.BR;

public class Clouds extends BaseObservable {

    private int all;

    @Bindable
    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
        notifyPropertyChanged(BR.all);
    }
}
