package com.example.dmihazem;

import java.sql.SQLException;
import java.util.List;

public abstract class StationDao {
    public abstract List<Station> getAllStations() throws SQLException;

    public abstract Station getStationById(int id) throws SQLException;

    public abstract void addStation(Station station) throws SQLException;

    public abstract void updateStation(Station station) throws SQLException;

    public abstract void deleteStation(int id) throws SQLException;
}
