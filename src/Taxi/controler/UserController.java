package Taxi.controler;

import Taxi.dao.AdminDao;
import Taxi.dao.UserDao;
import Taxi.model.User;

import java.util.Scanner;

public class UserController {

    private UserDao daoUser;
    private AdminDao daoAdmin;

    public UserController() {
        super();
        daoUser = new UserDao();
        daoAdmin = new AdminDao();
    }


    public  User login(){

        User user = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Hi!\n This is Taxi Marakasite \n Please Login <3 \n Username: ");
        String username = sc.nextLine();
        System.out.println("\n Password: ");
        String password = sc.nextLine();
        password = daoUser.hash(password);

        try {

            while( daoUser.checkIfUserExist(username, password) == null) {
                System.out.println("\n Wrong username or password!");
                System.out.println("\n Username: ");
                username = sc.nextLine();
                System.out.println("\n Password: ");
                password = sc.nextLine();
                password = daoUser.hash(password);

            }

            user = daoUser.checkIfUserExist(username, password);

            System.out.println("\n User exists!\n");

        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return user;
    }

}
