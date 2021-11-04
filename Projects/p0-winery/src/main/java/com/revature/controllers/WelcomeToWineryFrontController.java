package com.revature.controllers;

import com.revature.models.Wine;

import java.util.Scanner;

public class WelcomeToWineryFrontController {

    public static void printWelcomeMenu() {
        int quit = -1;
        int input = -1;
        byte choiceW = 0;

        Scanner scW = new Scanner(System.in);

        while (quit != 4) {
            System.out.println("Please select an option:"
                    + "/n" + "1 - View Catalog of Wines."
                    + "/n" + "2 - Login"
                    + "/n" + "3 - Register"
                    + "/n" + "4 - Exit"
            );
            choiceW = scW.nextByte();

            switch (choiceW) {
                case 1:
                    Wine.catalogOfWines();
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    RegisterUserController();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        System.out.println("Thank for visiting use, come back soon!");
        input = scW.nextInt();
        quit =  input;
        System.exit(quit);
        }

}

