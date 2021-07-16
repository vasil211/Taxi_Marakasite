package Taxi.dao;

import Taxi.model.Role;
import Taxi.model.User;
import Taxi.util.Database;
import org.apache.commons.validator.routines.EmailValidator;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

    private Connection connection;

    public UserDao() {
        super();
        connection = Database.getConnection();
    }


    public  User checkIfUserExist(String userName, String password) {
        try {
            PreparedStatement ps = connection.prepareStatement("select * from user where user_Name = ? and password = ?");
            ps.setString(1, userName);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUserName(rs.getString("user_Name"));
                //
                Role role = new Role();
                role.setId(rs.getInt("role_id"));
//                role.setRoleName(rs.getString("role_Name"));
                user.setRole(role);

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
