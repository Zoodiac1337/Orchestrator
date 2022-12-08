package com.example.Orchestrator.weather;

public class Day {
    private double maxtempC;
    private double maxtempF;
    private double mintempC;
    private double mintempF;
    private double avgtempC;
    private double avgtempF;
    private double maxwindMph;
    private double maxwindKph;
    private double totalprecipMm;
    private double totalprecipIn;
    private double avgvisKM;
    private double avgvisMiles;
    private double avghumidity;
    private Condition condition;
    private double uv;

    public double getMaxtempC() { return maxtempC; }
    public void setMaxtempC(double value) { this.maxtempC = value; }

    public double getMaxtempF() { return maxtempF; }
    public void setMaxtempF(double value) { this.maxtempF = value; }

    public double getMintempC() { return mintempC; }
    public void setMintempC(double value) { this.mintempC = value; }

    public double getMintempF() { return mintempF; }
    public void setMintempF(double value) { this.mintempF = value; }

    public double getAvgtempC() { return avgtempC; }
    public void setAvgtempC(double value) { this.avgtempC = value; }

    public double getAvgtempF() { return avgtempF; }
    public void setAvgtempF(double value) { this.avgtempF = value; }

    public double getMaxwindMph() { return maxwindMph; }
    public void setMaxwindMph(double value) { this.maxwindMph = value; }

    public double getMaxwindKph() { return maxwindKph; }
    public void setMaxwindKph(double value) { this.maxwindKph = value; }

    public double getTotalprecipMm() { return totalprecipMm; }
    public void setTotalprecipMm(double value) { this.totalprecipMm = value; }

    public double getTotalprecipIn() { return totalprecipIn; }
    public void setTotalprecipIn(double value) { this.totalprecipIn = value; }

    public double getAvgvisKM() { return avgvisKM; }
    public void setAvgvisKM(double value) { this.avgvisKM = value; }

    public double getAvgvisMiles() { return avgvisMiles; }
    public void setAvgvisMiles(double value) { this.avgvisMiles = value; }

    public double getAvghumidity() { return avghumidity; }
    public void setAvghumidity(double value) { this.avghumidity = value; }

    public Condition getCondition() { return condition; }
    public void setCondition(Condition value) { this.condition = value; }

    public double getUv() { return uv; }
    public void setUv(double value) { this.uv = value; }
}
