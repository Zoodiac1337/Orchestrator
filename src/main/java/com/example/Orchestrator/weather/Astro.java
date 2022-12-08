package com.example.Orchestrator.weather;

public class Astro {
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String moonPhase;
    private String moonIllumination;

    public String getSunrise() { return sunrise; }
    public void setSunrise(String value) { this.sunrise = value; }

    public String getSunset() { return sunset; }
    public void setSunset(String value) { this.sunset = value; }

    public String getMoonrise() { return moonrise; }
    public void setMoonrise(String value) { this.moonrise = value; }

    public String getMoonset() { return moonset; }
    public void setMoonset(String value) { this.moonset = value; }

    public String getMoonPhase() { return moonPhase; }
    public void setMoonPhase(String value) { this.moonPhase = value; }

    public String getMoonIllumination() { return moonIllumination; }
    public void setMoonIllumination(String value) { this.moonIllumination = value; }
}
