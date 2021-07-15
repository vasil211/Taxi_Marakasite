package Taxi.dao;

import Taxi.model.Role;
import Taxi.util.Database;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {

    private Connection connection;

    public User() {
        super();
        connection = Database.getConnection();
    }


    public boolean addRole(String role ) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "insert into role(roleName) values (?)");
            preparedStatement.setString(1, role);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }




    public String hash(String pass) {

        MessageDigest md;
        byte[] hash = null;
        try {
            md = MessageDigest.getInstance("MD5");
            hash = md.digest(pass.getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DatatypeConverter.printHexBinary(hash);
    }
}
