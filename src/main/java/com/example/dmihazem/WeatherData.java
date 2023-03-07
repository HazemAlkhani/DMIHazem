package com.example.dmihazem;

import java.sql.Timestamp;

public class WeatherData {

    private final int stationID;
    private final Timestamp datoTid;
    private final float precip;
    private final float precipMinutes;
    private final float avgTemp;
    private final float maxTemp;
    private final float minTemp;
    private final float sunshine;
    private final float avgWind;
    private final float maxWind;
    private final int cloudHeight;
    private final int cloudCover;

    public WeatherData(int stationID, Timestamp datoTid, float precip, float precipMinutes, float avgTemp, float maxTemp, float minTemp, float sunshine, float avgWind, float maxWind, int cloudHeight, int cloudCover) {
        this.stationID = stationID;
        this.datoTid = datoTid;
        this.precip = precip;
        this.precipMinutes = precipMinutes;
        this.avgTemp = avgTemp;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.sunshine = sunshine;
        this.avgWind = avgWind;
        this.maxWind = maxWind;
        this.cloudHeight = cloudHeight;
        this.cloudCover = cloudCover;
    }

    public int getStationID() {
        return stationID;
    }

    public Timestamp getDatoTid() {
        return datoTid;
    }

    public float getPrecip() {
        return precip;
    }

    public float getPrecipMinutes() {
        return precipMinutes;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public float getAvgTemp() {
        return avgTemp;
    }

    public float getMaxTemp() {
        return maxTemp;
    }

    public float getSunshine() {
        return sunshine;
    }

    public float getAvgWind() {
        return avgWind;
    }

    public float getMaxWind() {
        return maxWind;
    }

    public int getCloudHeight() {
        return cloudHeight;
    }

    public int getCloudCover() {
        return cloudCover;
    }
}
