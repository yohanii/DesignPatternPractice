package com.yohanii.design_pattern;

import java.sql.Connection;
import java.sql.SQLException;

public class BRepository {

    private DBUtils db;

    public BRepository() {
        this.db = DBUtils.getInstance();
    }

    public DBUtils getDb() {
        return db;
    }

    public Connection getConnection() throws SQLException {
        return db.getConnection();
    }
}
