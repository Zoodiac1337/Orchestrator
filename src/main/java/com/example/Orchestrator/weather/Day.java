package com.example.Orchestrator.weather;

public class Day{
    public double maxtemp_c;
    public double maxtemp_f;
    public double mintemp_c;
    public double mintemp_f;
    public double avgtemp_c;
    public double avgtemp_f;
    public double maxwind_mph;
    public double maxwind_kph;
    public double totalprecip_mm;
    public double totalprecip_in;
    public double avgvis_km;
    public double avgvis_miles;
    public double avghumidity;
    public Condition condition;
    public double uv;

    //Getters and setters


    public double getMaxtemp_c() {
        return maxtemp_c;
    }

    public void setMaxtemp_c(double maxtemp_c) {
        this.maxtemp_c = maxtemp_c;
    }

    public double getMaxtemp_f() {
        return maxtemp_f;
    }

    public void setMaxtemp_f(double maxtemp_f) {
        this.maxtemp_f = maxtemp_f;
    }

    public double getMintemp_c() {
        return mintemp_c;
    }

    public void setMintemp_c(double mintemp_c) {
        this.mintemp_c = mintemp_c;
    }

    public double getMintemp_f() {
        return mintemp_f;
    }

    public void setMintemp_f(double mintemp_f) {
        this.mintemp_f = mintemp_f;
    }

    public double getAvgtemp_c() {
        return avgtemp_c;
    }

    public void setAvgtemp_c(double avgtemp_c) {
        this.avgtemp_c = avgtemp_c;
    }

    public double getAvgtemp_f() {
        return avgtemp_f;
    }

    public void setAvgtemp_f(double avgtemp_f) {
        this.avgtemp_f = avgtemp_f;
    }

    public double getMaxwind_mph() {
        return maxwind_mph;
    }

    public void setMaxwind_mph(double maxwind_mph) {
        this.maxwind_mph = maxwind_mph;
    }

    public double getMaxwind_kph() {
        return maxwind_kph;
    }

    public void setMaxwind_kph(double maxwind_kph) {
        this.maxwind_kph = maxwind_kph;
    }

    public double getTotalprecip_mm() {
        return totalprecip_mm;
    }

    public void setTotalprecip_mm(double totalprecip_mm) {
        this.totalprecip_mm = totalprecip_mm;
    }

    public double getTotalprecip_in() {
        return totalprecip_in;
    }

    public void setTotalprecip_in(double totalprecip_in) {
        this.totalprecip_in = totalprecip_in;
    }

    public double getAvgvis_km() {
        return avgvis_km;
    }

    public void setAvgvis_km(double avgvis_km) {
        this.avgvis_km = avgvis_km;
    }

    public double getAvgvis_miles() {
        return avgvis_miles;
    }

    public void setAvgvis_miles(double avgvis_miles) {
        this.avgvis_miles = avgvis_miles;
    }

    public double getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(double avghumidity) {
        this.avghumidity = avghumidity;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }
}
