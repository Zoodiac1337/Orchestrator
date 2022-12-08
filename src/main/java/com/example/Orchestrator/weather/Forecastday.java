package com.example.Orchestrator.weather;

import java.time.LocalDate;

public class Forecastday {
    private LocalDate date;
    private long dateEpoch;
    private Day day;
    private Astro astro;
    private Hour[] hour;

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate value) { this.date = value; }

    public long getDateEpoch() { return dateEpoch; }
    public void setDateEpoch(long value) { this.dateEpoch = value; }

    public Day getDay() { return day; }
    public void setDay(Day value) { this.day = value; }

    public Astro getAstro() { return astro; }
    public void setAstro(Astro value) { this.astro = value; }

    public Hour[] getHour() { return hour; }
    public void setHour(Hour[] value) { this.hour = value; }
}