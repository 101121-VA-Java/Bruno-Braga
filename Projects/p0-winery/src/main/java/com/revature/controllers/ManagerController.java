package com.revature.controllers;

public class ManagerController {
    public static void ManagerMenu() {
        System.out.println("Manager Menu"
                + "\n" + "1 - Create an New Employee Account"
                + "\n" + "2 - Fire an Employee"
                + "\n" + "3 - View Sales History"
        );
        int options = sc.nextInt();
        switch (options) {
            case 1:
                RegisterUserController.registerUserMenu();
                break;
            case 2:
                FireEmployeeController.fireEmployeeMenu();
                break;
            case 3:
                ViewSalesHistoryController.viewSalesHistoryMenu();
                break;
            default:
                System.out.println("Invalid Option");
                ManagerMenu();
                break;
        }
    }
}
