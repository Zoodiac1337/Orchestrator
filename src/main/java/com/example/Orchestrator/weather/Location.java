package com.example.Orchestrator.weather;

public class Location {
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String tzID;
    private long localtimeEpoch;
    private String localtime;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getRegion() { return region; }
    public void setRegion(String value) { this.region = value; }

    public String getCountry() { return country; }
    public void setCountry(String value) { this.country = value; }

    public double getLat() { return lat; }
    public void setLat(double value) { this.lat = value; }

    public double getLon() { return lon; }
    public void setLon(double value) { this.lon = value; }

    public String getTzID() { return tzID; }
    public void setTzID(String value) { this.tzID = value; }

    public long getLocaltimeEpoch() { return localtimeEpoch; }
    public void setLocaltimeEpoch(long value) { this.localtimeEpoch = value; }

    public String getLocaltime() { return localtime; }
    public void setLocaltime(String value) { this.localtime = value; }
}