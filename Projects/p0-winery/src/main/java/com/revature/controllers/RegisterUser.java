package com.revature.controllers;

import java.util.Scanner;

import com.revature.exeptions.UsernameAlreadyExistsException;
import com.revature.models.Employee;
import com.revature.models.Role;
import com.revature.services.EmployeeService;

public class RegisterUser {

	private static EmployeeService us = new EmployeeService();

	public static void run(Scanner sc) throws UsernameAlreadyExistsException {
		System.out.println();
		System.out.println("Please enter your ID: (at least 4 char)");
		int employeeId = sc.nextInt();
		if (employeeId < 3) {
			System.out.println("Your ID should be at least 4 characters.");
			return;
		}
		System.out.println("Please enter your username: at least 4 char");
		String employeeName = sc.nextLine();
		if (employeeName.trim().length() < 3) {
			System.out.println("Your username should be at least 4 characters.");
			return;
		}

		System.out.println("Please enter your password: at least 4 char");
		String username = sc.nextLine();
		if (username.trim().length() < 3) {
			System.out.println("Your password should be at least 4 characters.");
			return;
		}
		System.out.println("Please enter your password: at least 4 char");
		String password = sc.nextLine();
		if (password.trim().length() < 3) {
			System.out.println("Your password should be at least 4 characters.");
			return;
		}
		
		System.out.println("You should choose one of the Roles:"
		+ "/n CUSTOMER"
		+ "/n EMPLOYEE");
		Role role = sc.next(Role);
		if (role.equals(role)) {
			System.out.println("You should choose one of the Roles:"
					+ "/n CUSTOMER"
					+ "/n EMPLOYEE");
			return;
		}
		System.out.println("Please enter your password: at least 4 char");
		double salary = sc.nextDouble();
		if (salary < 3) {
			System.out.println("Your password should be at least 4 characters.");
			return;
		}
		Employee newEmp = new Employee(employeeId, employeeName, username, password, role, salary);

		newEmp = us.addEmployee(newEmp);
		System.out.println("Welcome " + newEmp.getName() + "!");
	}

}
