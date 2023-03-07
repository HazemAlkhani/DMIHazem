package com.example.dmihazem;

public class Station {

    int stationID;
    String stationName;
    String lngLat;
    float height;
    String setup;


    public Station(int stationID, String stationName, String lngLat, float height, String setup) {
        this.stationID = stationID;
        this.stationName = stationName;
        this.lngLat = lngLat;
        this.height = height;
        this.setup = setup;
    }

    public Station(int id, String name, float latitude, float longitude) {

    }


    public int getStationID() {
        return stationID;
    }

    public void setStationID(int stationID) {
        this.stationID = stationID;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public float getLngLat() {
        return Float.parseFloat(lngLat);
    }

    public void setLngLat(String lngLat) {
        this.lngLat = lngLat;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetupDate(String setup) {
        this.setup = setup;
    }

    public String getName() {
        return null;
    }

    public float Heigh() {
        return 0;
    }

    public String Setup() {
        return null;
    }
}