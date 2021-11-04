package com.revature.controllers;

import java.util.Scanner;

public class RegisterUserController {

    public void userSignupMenu(){
        Scanner scRUC = new Scanner(System.in);
        System.out.println("Enter your username. You must enter your email address to your username:");
        String username = scRUC.nextLine();

        System.out.println("Enter your password:");
        String password = scRUC.nextLine();
    }



}
