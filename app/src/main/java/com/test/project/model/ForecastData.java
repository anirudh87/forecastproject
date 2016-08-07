package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.test.project.BR;

import java.util.List;

public class ForecastData extends BaseObservable {

    private City city;

    private String cod;

    private float message;

    private int cnt;

    private List<Forecast> list;

    @Bindable
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
        notifyPropertyChanged(BR.city);
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
    public float getMessage() {
        return message;
    }

    public void setMessage(float message) {
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

    @Bindable
    public List<Forecast> getList() {
        return list;
    }

    public void setList(List<Forecast> list) {
        this.list = list;
        notifyPropertyChanged(BR.list);
    }
}
