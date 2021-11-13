package com.revature.controllers;

import com.revature.exceptions.UserAlreadyExistsException;
import com.revature.models.Customer;
import com.revature.services.CustomerService;
import com.revature.services.PasswordValidation;

import java.util.Scanner;

public class CustomerRegisterController {
//     Scanner sc = new Scanner(System.in);
static CustomerService cs = new CustomerService();
//     PasswordValidation pv = new PasswordValidation();
//     WelcomeToWineryFrontController wtcr = new WelcomeToWineryFrontController();


    public static void customerRegistrationMenu(Scanner sc) {
        System.out.println("Please Enter Your Information Below");
        System.out.println("First Name: ");
        String firstName = sc.nextLine();

        System.out.println("Last Name: ");
        String lastName = sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();

        System.out.println("Password: ");
        String ps = sc.nextLine();

        String password = PasswordValidation.passwordChecker(ps);

        try {
            Customer nc = new Customer(firstName, lastName, email, password);
            cs.addCustomer(nc);
            System.out.println("Registration Successful");
        } catch (UserAlreadyExistsException e) {
            System.out.println("Email Already Exists");
        }
        System.out.println("Returning to Main Menu");
        WelcomeToWineryFrontController.welcomeToWineryMenu();
    }
}