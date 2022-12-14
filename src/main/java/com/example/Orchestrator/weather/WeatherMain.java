package com.example.Orchestrator.weather;


public class WeatherMain{
    public Location location;
    public Forecast forecast;

    //Getters and setters
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }
}
