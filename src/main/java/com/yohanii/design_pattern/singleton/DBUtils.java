package com.yohanii.design_pattern.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    private static final String JDBC_URI = "jdbc:mysql://localhost:3306/test";

    private static DBUtils db;

    private DBUtils() {
    }

    public static DBUtils getInstance() {
        if (db == null) {
            db = new DBUtils();
        }

        return db;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URI);
    }
}
