package Taxi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import Taxi.dao.User;

public class Main {


        public static void main(String[] args) {
            User dao;
            dao = new User();

            System.out.println("hello?\n");
            Scanner sc = new Scanner(System.in);

            String asd = sc.nextLine();
            System.out.println(asd);
             dao.addRole(asd);
        }
}

