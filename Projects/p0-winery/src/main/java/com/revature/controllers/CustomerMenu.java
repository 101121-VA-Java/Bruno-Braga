package com.revature.controllers;

import java.util.Scanner;

import com.revature.services.ItemService;

public class CustomerMenu {
	static Scanner sc = new Scanner(System.in);
	private static ItemService is = new ItemService();
	protected static int choice;

	public static void cusMenu() {
		boolean Successful = true;

		do {
			System.out.println("Customer Menu" + "\n" + "1 - View Our Catalog of Wines" + "\n"
                    + "2 - View My Wine Cellar" + "\n" + "3 - View My Orders" + "\n" + "4 - Logout");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println(" Wines Cellar: ");

				ItemService.buyFromInv(sc);
				Successful = false;
				break;
			case 2:
				System.out.println("Lets view Your Items");
				Successful = false;
				ItemService.viewCart(sc);

				break;
			case 3:
				System.out.println("Your Orders");
				ItemService.showOffers();
				Successful = false;
				cusMenu();
				break;
			case 4:

				System.out.println("Program exited!");
				WelcomeToWineryFrontController.welcomeToWineryMenu();
				Successful = false;
				break;

			default:
				System.out.println("Invaild input");
				Successful = false;
			}

		} while (Successful = false);
		sc.close();
	}
}
