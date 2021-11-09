package com.revature.controllers;

import java.util.Scanner;

public class RegisterUserController {
    static Scanner scR = new Scanner(System.in);

    public static void registerUserMenu() {

        System.out.println("Enter 1 if you wanna be a Customer or 2 if you are a Employee");
        int userType = scR.nextInt();
        switch (userType) {
            case 1:
                System.out.println("Enter your name");
                String name = scR.next();
                System.out.println("Enter your email");
                String email = scR.next();
                System.out.println("Enter your password");
                String password = scR.next();


                break;
            case 2 :
                System.out.println("Are you are a manager? Yes/No?"
                        + "\nEnter y for Yes or y for No:"
                );
                String answer = scR.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("Enter your manager email:");
                    String managerEmail = scR.nextLine();
                    System.out.println("Enter your manager password:");
                    String managerPassword = scR.nextLine();
                }
                else {
                    System.out.println("You must be a manager to register an employee");
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + userType);
        }
    }


}
