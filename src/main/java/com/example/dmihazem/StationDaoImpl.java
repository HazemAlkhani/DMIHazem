package com.example.dmihazem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StationDaoImpl extends StationDao {

    private final Connection connection;

    public StationDaoImpl(String url, String username, String password) throws SQLException {
        this.connection = DriverManager.getConnection(url, username, password);
    }


    @Override
    public List<Station> getAllStations() throws SQLException {
        List<Station> stations = new ArrayList<>();
        String sql = "SELECT * FROM Station";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Station station = new Station(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getFloat("latitude"),
                        resultSet.getFloat("longitude")
                );
                stations.add(station);
            }
        }
        return stations;
    }

    @Override
    public Station getStationById(int id) throws SQLException {
        String sql = "SELECT * FROM station WHERE StationID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Station(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getFloat("latitude"),
                            resultSet.getFloat("longitude")
                    );
                } else {
                    return null;
                }
            }
        }
    }

    @Override
    public void addStation(Station station) throws SQLException {
        String sql = "INSERT INTO station (StationID, StationName, LngLat, Height, Setup) VALUES ( ?,?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
           statement.setInt(1, station.getStationID());
            statement.setString(2, station.getName());
            statement.setFloat(3, station.getLngLat());
            statement.setFloat(4, station.Heigh());
            statement.setString(5, station.Setup());
            statement.executeUpdate();
        }
    }

    @Override
    public void updateStation(Station station) throws SQLException {
        String sql = "UPDATE station SET StationName = ?, LngLat = ?, Height = ? , Setup = ? WHERE StationID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, station.getName());
            statement.setFloat(2, station.getLngLat());
            statement.setFloat(3, station.Heigh());
            statement.setString(4, station.Setup());
            statement.setInt(5, station.getStationID());
            statement.executeUpdate();
        }
    }

    @Override
    public void deleteStation(int id) throws SQLException {
        String sql = "DELETE FROM station WHERE StationID = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}