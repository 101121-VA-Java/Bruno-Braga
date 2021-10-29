package com.revature;

import java.util.Scanner;

import com.revature.controllers.EmployeeController;
import com.revature.models.Employee;
import com.revature.models.Role;

//import com.revature.*;

public class Driver {

	static String option;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// will take user input

		run(sc);
	}

	static void run(Scanner scan) {

		while (true) {

			System.out.println("***************************-----WINERY----*********************************" + "\n"
					+ "*****************--We have the best wines that you can find--**************" + "\n"
					+ "***************************************************************************" + "\n"
					+ "-Please enter the number next to your option to select an item of the menu-" + "\n" + "1 - LOGIN"
					+ "\n" + "2 - REGISTER USER" + "\n" + "3 - VIEW WINE CATALOG" + "\n" + "4 - HELP" + "\n"
					+ "5 - EXIT" + "\n");

			option =scan.nextLine();

			String opt = option.toString();
			try {

			} catch (IllegalArgumentException e) {
				System.out.println("Invalid input");
				return;
			}
			switch (opt) {

			case "1":
				System.out.println(" Enter your user username" + "\n");
				String userInput1 = "rightUsername"; // TODO: compare username to validation goes here on the palace of
														// "rightUsername" String

				String userInput2 = "rightPassword"; // TODO: compare password to validation goes here on the palace of
														// "rightPassword" String
				if (userInput1.equals(scan.nextLine())) {
					System.out.println(" Enter your password ");
				}
				if (userInput2.equals(scan.nextLine())) {
					System.out.println(" Hi" + " rightUsername" + "!");
				}

				break;

			case "2":

				while (true) {
					System.out.println("Please enter a EmployeeId:");
					int employeeId = scan.nextInt();
					System.out.println("Please enter a password:");
					String employeeName = scan.nextLine();
					System.out.println("Please enter your name: ");
					String username = scan.nextLine();
					System.out.println("Please enter your name: ");
					String password = scan.nextLine();
					System.out.println("Please choose one of the following employee roles: " + "\n" + "1 -"
							+ Role.MANAGER + "\n" + "2 -" + Role.STAFF_MEMBER);
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
					Role chosenRole = Role.MANAGER;
					
					if (chosenRole.equals(Role.MANAGER)) {
						System.out.println("Lucky you! You're a Manager");// TODO: CHANGE THIS LOL
					}else if (chosenRole.equals(Role.STAFF_MEMBER)) {
						System.out.println("Poor Staff Member you're doomed");// TODO: CHANGE THIS LOL
					}
					System.out.println("Please enter the desired salary for this employee: ");
					double salary = scan.nextDouble();

					Employee newEmployee = new Employee(employeeId, employeeName, username, password, chosenRole, salary);

					// TODO: check whether an employee created or not (if the method works)
//					us.addEmployee(newEmployee);

					System.out.println("Employee has been registered");
				}

//			break;

			case "3":

				break;
			case "4":

				break;

			case "5":

				break;

			default:
				System.out.println("Input invalid, please try again");

			}

		}
	}

}
