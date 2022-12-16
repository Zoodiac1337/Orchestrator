package com.example.Orchestrator.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Weather {
    public static ArrayList<Forecastday> getWeather(String location) throws IOException {
        URL myURL = new URL("http://api.weatherapi.com/v1/forecast.json?key=d110addc3f3c40e99d8155304221612&q="+location+"&days=5&aqi=no&alerts=no");
        HttpURLConnection con = (HttpURLConnection) myURL.openConnection();
        con.setRequestProperty("X-RapidAPI-Key", "MHhiKZ2sNLh6Ui8WTsR3qA==eUqDKjFLKZbf4zh9");
        con.setRequestProperty("X-RapidAPI-Host", "weather-by-api-ninjas.p.rapidapi.com");
        con.setRequestMethod("GET");
        con.connect();

        String response = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line = in.readLine();

        while (line != null)
        {
            response += line + "\r\n";
            line = in.readLine();
        }

        ObjectMapper mapper = JsonMapper.builder().findAndAddModules().build();
        WeatherMain forecast = mapper.readValue(response, WeatherMain.class);


        return forecast.forecast.forecastday;
    }
}
