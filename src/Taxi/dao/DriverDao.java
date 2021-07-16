package Taxi.dao;

import Taxi.util.Database;

import java.sql.Connection;

public class DriverDao {

    private Connection connection;

    public DriverDao() {
        super();
        connection = Database.getConnection();
    }
// see




}
