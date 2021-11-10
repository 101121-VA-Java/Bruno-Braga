package com.revature.controllers;
import com.revature.services.CustomerService;
import java.util.Scanner;

public class CustomerController {
    CustomerServices cs = new CustomerServices();


    public static void customerMainMenu() {
        int choice = -1; // set out to off reach value so the while loop begins// prints menu
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        while(choice != 5){

                System.out.println("Customer Dashboard:"
                        + "\n" + "1: View Our Catalog of Wines"
                        + "\n" + "2: View My Wines "
                        + "\n" + "3: View My Remaining Payment "
                        + "\n" + "4 - Go back to the previews menu");

            switch(choice){
                case 1:
                    System.out.println("View Our Catalog of Wines");
                    sc.nextLine();
                    // view Catalog of Wines


                    break;
                case 2:
                    // View My Wines


                    break;
                case 3:
                    // View Remaining Payment


                    break;
                case 4:
                    // back to previous menu


                    break;
                default:
                    System.out.println("Invalid input, please select an option 1-4.");
                    System.out.println();
            }
        }
    }


}
