package com.revature.controllers;

import java.util.Scanner;

public class FrontController {
	private Scanner sc; 
	private UserController uc;
	
	public FrontController() {
		sc = new Scanner(System.in);
		uc = new EmployeeController();
	}
	
	public void run() {
		boolean run = true;
		
		while(run) {
			System.out.println("Please select an option:");
			System.out.println("1: register");
			System.out.println("2: login");
			System.out.println("3: exit");
			
			String choice = uc.nextLine();
			
			switch(choice) {
			case "1":
				uc.registerEmployee(uc);
				// TODO: if an employee is not registered, display a different message
				break;
			case "2":
				break;
			case "3":
				run = false;
				break;
			default:
				System.out.println("Invalid input.");
			}
		}
		
		sc.close();
	}
}

