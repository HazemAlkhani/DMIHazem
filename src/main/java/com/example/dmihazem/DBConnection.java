package com.example.dmihazem;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() throws SQLException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setDatabaseName("DMIDB");
        ds.setUser("sa");
        ds.setPassword("700170");
        ds.setPortNumber(1433);
        ds.setServerName("ASUS-ROG");
        ds.setTrustServerCertificate(true);

        return ds.getConnection();
    }
}