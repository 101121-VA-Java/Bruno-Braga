package com.revature.controllers;

import java.util.Scanner;

public class EmployeeController {

    public static void employeeMenu() {
        boolean run = true;

        Scanner sc = new Scanner(System.in);
        while (run) {
            System.out.println("Employee System Options:" + "\n" + "1 - Add an item into wine catalog." + "\n"
                    + "2 - Remove an item from wine catalog." + "\n" + "3 - Accept or reject offers for items." + "\n"
                    + "4 - View all payments." + "\n" + "5 - Edit exiting items." + "\n"
                    + "6 - Go back to the previous menu." + "\n" + "7 - Exit the system.");
            int choice = sc.nextInt();
            String wineName;
            String wineType;
            int wineID;
            switch (choice) {
            case 1:
                System.out.println("Enter the name of the wine you would like to add.");
                wineName = sc.nextLine();
                System.out.println("Enter the type of the wine you would like to add.");
                wineType = sc.nextLine();
                System.out.println("Enter the id of the wine you would like to add.");
                wineID = sc.nextInt();
                break;
            case 2:
                System.out.println("Enter the Item Id that you which to remove.");
                wineID = sc.nextInt();
                break;
            case 3:
                System.out.println("Enter the name of the wine you would like to accept or reject.");
            }
        }

    }

}
