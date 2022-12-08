package com.example.Orchestrator.weather;

public class Hour {
    private long timeEpoch;
    private String time;
    private double tempC;
    private double tempF;
    private long isDay;
    private Condition condition;
    private double windMph;
    private double windKph;
    private long windDegree;
    private String windDir;
    private double pressureMB;
    private double pressureIn;
    private double precipMm;
    private double precipIn;
    private long humidity;
    private long cloud;
    private double feelslikeC;
    private double feelslikeF;
    private double windchillC;
    private double windchillF;
    private double heatindexC;
    private double heatindexF;
    private double dewpointC;
    private double dewpointF;
    private long willItRain;
    private long chanceOfRain;
    private long willItSnow;
    private long chanceOfSnow;
    private double visKM;
    private double visMiles;
    private double gustMph;
    private double gustKph;

    public long getTimeEpoch() { return timeEpoch; }
    public void setTimeEpoch(long value) { this.timeEpoch = value; }

    public String getTime() { return time; }
    public void setTime(String value) { this.time = value; }

    public double getTempC() { return tempC; }
    public void setTempC(double value) { this.tempC = value; }

    public double getTempF() { return tempF; }
    public void setTempF(double value) { this.tempF = value; }

    public long getIsDay() { return isDay; }
    public void setIsDay(long value) { this.isDay = value; }

    public Condition getCondition() { return condition; }
    public void setCondition(Condition value) { this.condition = value; }

    public double getWindMph() { return windMph; }
    public void setWindMph(double value) { this.windMph = value; }

    public double getWindKph() { return windKph; }
    public void setWindKph(double value) { this.windKph = value; }

    public long getWindDegree() { return windDegree; }
    public void setWindDegree(long value) { this.windDegree = value; }

    public String getWindDir() { return windDir; }
    public void setWindDir(String value) { this.windDir = value; }

    public double getPressureMB() { return pressureMB; }
    public void setPressureMB(double value) { this.pressureMB = value; }

    public double getPressureIn() { return pressureIn; }
    public void setPressureIn(double value) { this.pressureIn = value; }

    public double getPrecipMm() { return precipMm; }
    public void setPrecipMm(double value) { this.precipMm = value; }

    public double getPrecipIn() { return precipIn; }
    public void setPrecipIn(double value) { this.precipIn = value; }

    public long getHumidity() { return humidity; }
    public void setHumidity(long value) { this.humidity = value; }

    public long getCloud() { return cloud; }
    public void setCloud(long value) { this.cloud = value; }

    public double getFeelslikeC() { return feelslikeC; }
    public void setFeelslikeC(double value) { this.feelslikeC = value; }

    public double getFeelslikeF() { return feelslikeF; }
    public void setFeelslikeF(double value) { this.feelslikeF = value; }

    public double getWindchillC() { return windchillC; }
    public void setWindchillC(double value) { this.windchillC = value; }

    public double getWindchillF() { return windchillF; }
    public void setWindchillF(double value) { this.windchillF = value; }

    public double getHeatindexC() { return heatindexC; }
    public void setHeatindexC(double value) { this.heatindexC = value; }

    public double getHeatindexF() { return heatindexF; }
    public void setHeatindexF(double value) { this.heatindexF = value; }

    public double getDewpointC() { return dewpointC; }
    public void setDewpointC(double value) { this.dewpointC = value; }

    public double getDewpointF() { return dewpointF; }
    public void setDewpointF(double value) { this.dewpointF = value; }

    public long getWillItRain() { return willItRain; }
    public void setWillItRain(long value) { this.willItRain = value; }

    public long getChanceOfRain() { return chanceOfRain; }
    public void setChanceOfRain(long value) { this.chanceOfRain = value; }

    public long getWillItSnow() { return willItSnow; }
    public void setWillItSnow(long value) { this.willItSnow = value; }

    public long getChanceOfSnow() { return chanceOfSnow; }
    public void setChanceOfSnow(long value) { this.chanceOfSnow = value; }

    public double getVisKM() { return visKM; }
    public void setVisKM(double value) { this.visKM = value; }

    public double getVisMiles() { return visMiles; }
    public void setVisMiles(double value) { this.visMiles = value; }

    public double getGustMph() { return gustMph; }
    public void setGustMph(double value) { this.gustMph = value; }

    public double getGustKph() { return gustKph; }
    public void setGustKph(double value) { this.gustKph = value; }
}