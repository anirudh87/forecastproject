package com.test.project.retrofit;


import com.test.project.model.CurrentData;
import com.test.project.model.ForecastData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface WeatherService {

    @GET("weather")
    Observable<CurrentData> getCurrentData(@Query("q") String searchKeyword, @Query("appid") String appid);

    @GET("forecast")
    Observable<ForecastData> getForecastData(@Query("q") String searchKeyword, @Query("appid") String appid);

}

