package com.example.Orchestrator.weather;

import com.example.Orchestrator.weather.Day;
import com.example.Orchestrator.weather.WeatherMain;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;

public class Weather {
    public static Day getWeather(String location, LocalDate date) throws IOException {
        URL myURL = new URL("http://api.weatherapi.com/v1/future.json?key=efecec4ef80f4b089ed202902220712&q="+location+"&dt="+date);
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


        return forecast.forecast.forecastday.get(0).day;
    }
}
