package com.example.Orchestrator.main;

import com.example.Orchestrator.main.APIConnector;
import com.example.Orchestrator.weather.WeatherMain;

import java.io.IOException;
import java.time.LocalDate;

public class Weather {
    public static String getWeather(String location, LocalDate date) throws IOException {

//        GsonBuilder builder = new GsonBuilder();
//        builder.setPrettyPrinting();
//        Gson gson = builder.create();
//

//        String jsonString =APIConnector.GET("http://api.weatherapi.com/v1/future.json?key=efecec4ef80f4b089ed202902220712&q="+location+"&dt="+date);
//        WeatherMain forecast = gson.fromJson


        return APIConnector.GET("http://api.weatherapi.com/v1/future.json?key=efecec4ef80f4b089ed202902220712&q="+location+"&dt="+date);
    }


}
