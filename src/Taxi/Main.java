package Taxi;

import java.util.Scanner;

import Taxi.dao.AdminDao;
import Taxi.dao.UserDao;

public class Main {


        public static void main(String[] args) {
            UserDao daoUserDao;
            AdminDao daoAdminDao;

            daoAdminDao = new AdminDao();
            daoUserDao = new UserDao();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println(" Hi!\n This is Taxi Marakasite \n Please Login <3 \n Username: ");

                String username = sc.nextLine();
                System.out.println("\n Password: ");
                String password = sc.nextLine();
                password = daoUserDao.hash(password);

                try {

                    while( daoUserDao.checkIfUserExist(username, password) == null){
                        System.out.println("\n Wrong username or password!");
                        System.out.println("\n Username: ");
                        username = sc.nextLine();
                        System.out.println("\n Password: ");
                        password = sc.nextLine();
                        password = daoUserDao.hash(password);
                    }
                    System.out.println("\n User exists!\n");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        }
}

