package com.revature.controllers;

import com.revature.exceptions.LoginException;
import com.revature.services.UsersServices;

import java.util.Scanner;

public class LoginUserController {

    private static final Scanner sc = new Scanner(System.in);
    private static final UsersServices us = new UsersServices();

    public static void loginUserControllerMenu() {
        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        try {
            us.loginUser(username, password);
            System.out.println("Log In Successful!");
            us.loginUser(username, password);
        } catch (LoginException e) {
            System.out.println("Invalid Login, Enter 1 to Try Again or Enter 2 for Register an new Account:");
            String input = sc.nextLine();
            if (input.equals("1")) {
                loginUserControllerMenu();
            } else {
                RegisterUserController.registerUserMenu();
            }
        }
    }


}

