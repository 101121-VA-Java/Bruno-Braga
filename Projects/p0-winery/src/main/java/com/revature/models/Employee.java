package com.revature.models;

import com.revature.repositories.UserDAO;

public class Employee extends User implements UserDAO{

	private int employeeId;
	private String employeeName;
	private User username;
	private User password;
	private Role roleType; // using an enum to store a specific value
	private Employee manager;
	
	

	
	
	/*
	 * Project0 Design

- User has {Role, userId, username, password}, register, login, logout
- Customer (is a User), has {customerId, name, phone, email, address}, viewItem, makeOfferForItem, makePayment, viewPaymentBalance
- Employee has {employeeId, name, employeeRole}, addItem, removeItem, acceptRejectOffer, viewPayments,
- Manager (is an Employee) createEmployee, removeEmployee, viewSalesHistory
- Item {itemId, description, quantity, state?}
- System updateItemState, calculateWeeklyPayments
- Page
- Products(is an Item)
- Role
	 */
	
	
	
	
}
