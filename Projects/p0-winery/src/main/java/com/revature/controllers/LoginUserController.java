package com.revature.controllers;

import java.util.Scanner;

public class LoginUserController {
    Scanner sc = new Scanner(System.in);


    public void userLoginMenu(){
        System.out.println("Enter your username. That is the email that you have used register your account:");
        String username = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();
}


}
