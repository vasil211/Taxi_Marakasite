package Taxi;

import java.util.Scanner;

import Taxi.controler.UserController;
import Taxi.dao.AdminDao;
import Taxi.dao.UserDao;
import Taxi.model.User;

public class Main {

        public static void main(String[] args) {


            User user = new User();
            UserController userController = new UserController();

            user = userController.login();


        }
}

