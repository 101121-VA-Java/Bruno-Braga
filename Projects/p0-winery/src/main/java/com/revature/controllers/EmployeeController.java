package com.revature.controllers;

import java.util.Scanner;
import com.revature.exceptions.UserNotFoundException;
import com.revature.models.Employee;
import com.revature.models.Role;
import com.revature.services.EmployeeService;

public class EmployeeController {

//	private EmployeeService us = new EmployeeService();
	public Exception userNotFound = new UserNotFoundException();

	public void searchForEmployee() {

	}

	public static void registerEmployee(Scanner scan) {
		while(true) {
			System.out.println("Please enter a username:");
			int employeeId = scan.nextInt();
			System.out.println("Please enter a password:");
			String employeeName = scan.nextLine();
			System.out.println("Please enter your name: ");
			String username = scan.nextLine();
			System.out.println("Please enter your name: ");
			String password = scan.nextLine();
			System.out.println("Please choose one of the following employee roles: " + "\n" + "1 -"+ Role.MANAGER + "\n" + "2 -"+ Role.STAFF_MEMBER);
			// TODO: search to create a menu that choose between enum

			String whichView = scan.nextLine();
				switch (whichView) {
					case "1":
						Role MANAGER;
					case "2":
						Role STAFF_MEMBER;
					default:
						System.out.println("Please enter a valid input");
				}
			Role chosenRole = Role(MANAGER) ;
			System.out.println("Please enter the desire salary for this employee: ");
			double salary = scan.nextDouble();
	
			Employee newEmployee = new Employee(employeeId, employeeName, username, password, role, salary);
	
			// TODO: check whether an employee created or not (if the method works)
			us.addEmployee(newEmployee);
	
			System.out.println("Employee has been registered");
		}

	private static Role Role() {
		// TODO Auto-generated method stub
		return null;
	}

	public void registerEmployee(EmployeeController uc) {
		// TODO Auto-generated method stub

	}

	public String nextLine() {
		// TODO Auto-generated method stub
		return null;

	}
}