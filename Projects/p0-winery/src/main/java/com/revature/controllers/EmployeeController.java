package com.revature.controllers;


import com.revature.exceptions.WineryCatalogDAO;

import javax.xml.catalog.Catalog;
import java.util.Scanner;

public class EmployeeController {


    public static void printEmployeeMenu() {
        int quit = -1;
        int input = -1;
        byte choiceEC = 0;

        Scanner scEC = new Scanner(System.in);
        while (choiceEC != 5) {
            System.out.println("Employee System Options:"
                    + "/n" + "1 - Add an item into wine catalog."
                    + "/n" + "2 - Remove an item from wine catalog."
                    + "/n" + "3 - Accept or reject offers for items."
                    + "/n" + "4 - View all payments."
                    + "/n" + "5 - Edit exiting items."
                    + "/n" + "6 - Go back to the previous menu."
            );
            choiceEC = scEC.nextByte();
            switch (choiceEC) {
                case 1:
                    WineryCatalogDAO.AddItemToCatalog();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        System.out.println(" ");
        input = scW.nextInt();
        quit =  input;

        if (choiceEC==5)
        {
            WelcomeToWineryFrontController.printWelcomeMenu();
        }
    }

}





