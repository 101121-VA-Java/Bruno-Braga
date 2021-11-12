package com.revature.controllers;

import java.util.Scanner;

public class RegisterController {
    public static CustomerRegisterController cr = new CustomerRegisterController();
    public static EmployeeRegisterController er = new EmployeeRegisterController();


    public static void regitrationMenu (Scanner sc){
        boolean run = true;
        while (run) {
            System.out.println("Choose between the following options: "
            +"\n "+"1 - For Customer Registration"
            +"\n "+"2 - For Employee Registration"
            +"\n "+"3 - To Go back");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Customer Registration");
                    cr.customerRegistrationMenu(sc);
                    run = false;
                    break;
                case 2:
                    System.out.println("Employee Registration");
                    er.employeeRegistrationMenu(sc);
                    run = false;
                    break;
                case 3:
                    System.out.println("Going back to the main menu");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

}
