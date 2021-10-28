package com.revature.services;

import com.revature.daos.CustomerDAO;
import com.revature.models.Customer;

public class CustomerService {


	private CustomerDAO cd;
	
	public int addCustomer(Customer c) {


		return cd.addCustomer(c);
	}
}

