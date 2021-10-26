package com.revature.repositories;

import com.revature.models.Customer;

public class CustomerArray implements CustomerDao {

	private Customer[] customers;

	public CustomerArray() {
		super();
	}

	@Override
	public Customer[] getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addCustomer(Customer c) {

		// Create a temp array of size customers + 1
		Customer[] temp = new Customer[customers.length + 1];

		int i = 0;

		for (; i < customers.length; i++) {
			temp[i] = customers[i];
		}
		/*
		 * i is the value of the last index of the new array (customers.length) set i to
		 * be the id for the new customer
		 */
		c.setId(i);

		// adding the new customer to the array
		temp[i] = c;

		/*
		 * assign the newly created array to customers
		 */
		customers = temp;

		return i;
	}

	@Override
	public boolean editCustomer(Customer C) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
