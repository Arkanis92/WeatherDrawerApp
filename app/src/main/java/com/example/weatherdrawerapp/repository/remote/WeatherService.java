package com.example.weatherdrawerapp.repository.remote;

import com.example.weatherdrawerapp.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("/forecast/8655636f4b3d899ec4a94161cd346817/{latitude},{longitude}/")
    Call<WeatherResponse> getWeatherList(
            @Path("latitude") double latitude,
            @Path("longitude") double longitude,
            @Query("exclude") String exclude
    );
}

