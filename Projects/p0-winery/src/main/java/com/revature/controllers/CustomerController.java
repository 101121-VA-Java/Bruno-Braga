package com.revature.controllers;
import com.revature.services.CustomerService;

import java.util.Scanner;

public class CustomerController {
    static Scanner sc = new Scanner(System.in);

    public static void customerMenu() {
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        while(run){

                System.out.println("Customer Menu"
                        + "\n" + "1 - View Our Catalog of Wines"
                        + "\n" + "2 - View My Wine Cellar"
                        + "\n" + "3 - View My Orders"
                        + "\n" + "4 - Logout");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("View Our Catalog of Wines");
                    run = false;
                    break;
                case 2:
                    System.out.println("View My Wine Cellar");
                    run = false;
                    break;
                case 3:
                    run = false;
                    break;
                case 4:
                    System.out.println("Logging out...");
                    CustomerService.logout();
                    System.out.println("You have been logged out.");
                    WelcomeToWineryFrontController.welcomeToWineryMenu();
                    run = false;
                    break;
                default:
                    System.out.println("Invalid input, please select an option 1-4.");
                    System.out.println();
            }
        }
    }
}
