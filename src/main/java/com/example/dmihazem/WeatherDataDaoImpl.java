package com.example.dmihazem;

import java.sql.*;

public class WeatherDataDaoImpl extends WeatherDataDao {

    public WeatherDataDaoImpl(String url, String username, String password) throws SQLException {
        DriverManager.getConnection(url, username, password);
    }

}
