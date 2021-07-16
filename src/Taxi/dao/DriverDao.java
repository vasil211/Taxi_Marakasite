package Taxi.dao;

import Taxi.util.Database;

import java.sql.Connection;

public class DriverDao {

    private Connection connection;

    public DriverDao() {
        super();
        connection = Database.getConnection();
    }
//  priemane na zaqven kurs i opredelqne ma cena
//  end kurs
//  pregled na all zavyrsheni kursove
//  pregled na ocenkite ot kursovete i obshta ocenka
//  more?




}
