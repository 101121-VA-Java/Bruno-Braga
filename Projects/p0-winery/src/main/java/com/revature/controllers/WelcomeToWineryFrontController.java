package com.revature.controllers;

import java.util.Scanner;

public class WelcomeToWineryFrontController {
    public static Scanner sc = new Scanner(System.in);
//    public static LoginController lc = new LoginController();
//    public RegistrationController rc = new RegistrationController();


    public static void welcomeToWineryMenu() {
        boolean run = true;
        while (run) {
            System.out.println(
                    "\n" + "Winery: Best wines that you can find!"
                            + "\n" + "---DON'T TAKE YOURSELF SO SERIOUSLY. JUST YOUR WINE.---"
                            + "\n" + "Please enter the number correspondent to your option"
                            + "\n" + "1 - Login"
                            + "\n" + "2 - Register"
                            + "\n" + "3 - Exit"
            );
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter your login credentials.");
//                    lc.userLogin(sc);
                    run = false;
                    break;
                case 2:
                    System.out.println("Please enter the information to register.");
                    RegistrationController.regitrationMenu(sc);
                    run = false;
                    break;
                case 3:
                    System.out.println("Are you sure you want to exit?");
                    run = returnToMainMenu();
                    break;
                default:
                    System.out.println("\n" + "Invalid input. Please try again.");
                    welcomeToWineryMenu();
            }
        }
    }


    public static boolean returnToMainMenu() {
        System.out.println("Enter 1 to return to the main menu or 2 to Exit.");
        int choice = sc.nextInt();
        if (choice == 1) {
            welcomeToWineryMenu();
            return true;
        } else {
            System.out.println("\n" + "Successfully exited.");
            return false;
        }

    }

}



