package Taxi;

import java.util.Scanner;

import Taxi.controler.UserController;
import Taxi.dao.AdminDao;
import Taxi.dao.UserDao;
import Taxi.model.User;

public class Main {

        public static void main(String[] args) {

            while (true) {

                User user = new User();
                UserController userController = new UserController();

                user = userController.login();

                System.out.println(user.getUserName());
                System.out.println(user.getRole());

                if (user.getRole() == 01) {
                    System.out.println("\n admin\n");

                } else if (user.getRole() == 02) {
                    System.out.println("\n driver\n");

                } else if (user.getRole() == 03) {
                    System.out.println("\n user\n");

                }

            }

        }
}

