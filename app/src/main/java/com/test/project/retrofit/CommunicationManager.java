package com.test.project.retrofit;

import com.test.project.model.CurrentData;
import com.test.project.model.ForecastData;
import com.test.project.util.Constants;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

public class CommunicationManager {

    public Observable<CurrentData> getCurrentData(String searchKeyword) {
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.API_URL)
                .build();

        WeatherService weatherService = retrofit.create(WeatherService.class);
        return weatherService.getCurrentData(searchKeyword, Constants.API_KEY);
    }

    public Observable<ForecastData> getForecastData(String searchKeyword) {
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.API_URL)
                .build();

        WeatherService weatherService = retrofit.create(WeatherService.class);
        return weatherService.getForecastData(searchKeyword, Constants.API_KEY);
    }
}
