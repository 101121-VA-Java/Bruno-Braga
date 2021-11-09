package com.revature.controllers;

import java.util.Scanner;

public class WelcomeToWineryFrontController {
    public static Scanner sc = new Scanner(System.in);
    private static String exit;

    public static void returnToMainMenu() {
        if (exit.equals("y")) {
            System.out.println("\n" + "Exiting program.");
            System.exit(0);
        } else {
            System.out.println("\n" + "Returning to Main Menu.");
            printWelcomeMenu();

        }
    }

    public static void printWelcomeMenu() {

        System.out.println(
                "\n" + "Winery: Best wines that you can find!"
                        + "\n" + "---DON'T TAKE YOURSELF SO SERIOUSLY. JUST YOUR WINE.---"
                        + "\n" + "Please enter the number correspondent to your option to"
                        + "\n" + "Please select an option:"
                        + "\n" + "or enter 4 to quit"
                        + "\n" + "1 - Login"
                        + "\n" + "2 - Register"
                        + "\n" + "3 - Exit"
        );
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\n" + "Login:"
                        + "\n" + "1 - Login"
                        + "\n" + "2 - Back to Main Menu"
                        + "\n" + "3 - Exit"
                );
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        LoginUserController.loginUserControllerMenu();
                        break;
                    case 2:
                        printWelcomeMenu();
                        break;
                    case 3:
                        WelcomeToWineryFrontController.returnToMainMenu();
                        break;
                    default:
                        System.out.println("\n" + "Invalid input. Please try again.");
                }
                break;
            case 2:
                System.out.println("\n" + "Register:"
                        + "\n" + "1 - Register"
                        + "\n" + "2 - Back to Main Menu"
                );
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        RegisterUserController.registerUserMenu();
                        break;
                    case 2:
                        printWelcomeMenu();
                        break;
                    default:
                        System.out.println("\n" + "Invalid input. Please try again.");
                }
                break;
            case 3:
                System.out.println("\n" + "Do you really want to exit? (y/n)");
                exit = sc.next("y");

                break;
            default:
                System.out.println("\n" + "Invalid input. Please try again.");
                printWelcomeMenu();
        }
    }
}



