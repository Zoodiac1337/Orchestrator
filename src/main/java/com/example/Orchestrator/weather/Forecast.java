package com.example.Orchestrator.weather;

import java.util.ArrayList;

public class Forecast{
    public ArrayList<Forecastday> forecastday;

    //Getters and setters
    public ArrayList<Forecastday> getForecastday() {
        return forecastday;
    }

    public void setForecastday(ArrayList<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }
}