package Taxi.dao;

import Taxi.util.Database;


import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AdminDao {

    private Connection connection;

    public AdminDao() {
        super();
        connection = Database.getConnection();
    }


    public boolean addRole(String role ) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into role(role_Name) values (?)");

            preparedStatement.setString(1, role);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
