package com.test.project.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.test.project.BR;

public class WeatherData extends BaseObservable {

    private float temp;

    @SerializedName("temp_min")
    private float tempMin;

    @SerializedName("temp_max")
    private float tempMax;

    private float pressure;

    @SerializedName("sea_level")
    private float seaLevel;

    @SerializedName("gmd_level")
    private float gmdLevel;

    private int humidity;

    @SerializedName("temp_kf")
    private float tempKf;

    @Bindable
    public float getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(float seaLevel) {
        this.seaLevel = seaLevel;
        notifyPropertyChanged(BR.seaLevel);
    }

    @Bindable
    public float getGmdLevel() {
        return gmdLevel;
    }

    public void setGmdLevel(float gmdLevel) {
        this.gmdLevel = gmdLevel;
        notifyPropertyChanged(BR.gmdLevel);
    }

    @Bindable
    public float getTempKf() {
        return tempKf;
    }

    public void setTempKf(float tempKf) {
        this.tempKf = tempKf;
        notifyPropertyChanged(BR.tempKf);
    }

    @Bindable
    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notifyPropertyChanged(BR.temp);
    }

    @Bindable
    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        notifyPropertyChanged(BR.pressure);
    }

    @Bindable
    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyPropertyChanged(BR.humidity);
    }

    @Bindable
    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float temp_min) {
        this.tempMin = tempMin;
        notifyPropertyChanged(BR.tempMin);
    }

    @Bindable
    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMin = tempMax;
        notifyPropertyChanged(BR.tempMax);
    }
}
