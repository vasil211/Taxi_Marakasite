package Taxi.dao;


import Taxi.model.User;
import Taxi.util.Database;
import org.apache.commons.validator.routines.EmailValidator;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//  registraciq (i vhod s google api)
//  zaqvqvane na prevoz -- nachalen i kraen adres i vreme na vzimane
//  pregled sys spisyka svobodni shofiori
//  ocenqvane na shofior sled prikliuchen prevoz
//  pregled na istoriqta pytivaniqta



public class UserDao {

    private Connection connection;

    public UserDao() {
        super();
        connection = Database.getConnection();
    }


    public  User checkIfUserExist(String userName, String password) {
        try {
            PreparedStatement ps = connection.prepareStatement("select * from users where user_Name = ? and password = ?");
            ps.setString(1, userName);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUserName(rs.getString("user_Name"));
                user.setRole_id(rs.getInt("role_id"));
                user.setId(rs.getInt("id"));
                return user;
            } else {
                return null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
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

    public String validEmail(String email) {

        boolean valid = EmailValidator.getInstance().isValid(email);

        if (valid) {
            return email;
        } else {

            return null;
        }
    }
}
