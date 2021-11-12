package com.revature.services;

import java.util.Scanner;

public class PasswordValidation {
     static Scanner sc = new Scanner(System.in);

    public static String passwordChecker(String ps) {
        System.out.println("Please Enter Your Password, Must Be At Least 8 Characters Long");
        ps = sc.nextLine();
        if(ps.trim().length() < 8) {
            passwordChecker(ps);
        }
        return ps;
    }
}
