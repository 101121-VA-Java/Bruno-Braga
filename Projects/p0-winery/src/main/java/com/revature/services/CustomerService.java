package com.revature.services;

import com.revature.dao.CustomerDao;

import com.revature.dao.CustomerPostgres;
import com.revature.exception.LoginException;
import com.revature.exception.UserAlreadyExistsException;
import com.revature.exception.UsernameAlreadyExistsException;
import com.revature.models.Customer;

import java.util.List;

public class CustomerService {
	protected CustomerDao cd = new CustomerPostgres();

	
	
	public Customer addCustomer(Customer c) throws UsernameAlreadyExistsException{
		
		Customer newCustomer = this.getCustomerByUsername(c.getUsername());
		if(newCustomer != null) {
			throw new UsernameAlreadyExistsException();
		}

		return cd.add(c);
	}

	private Customer getCustomerByUsername(String username) {
		List<Customer> customers = cd.getAll();
		for(Customer c : customers) {
			if(c.getUsername().equals(username)) {
				return c;
			}
		}
		return null;
	}
	public Customer login(String username, String password) throws LoginException {
		Customer c = this.getCustomerByUsername(username);
		if(c == null || !c.getPassword().equals(password)) {
			throw new LoginException();
		} 
		c.setLogged(true);
		cd.update(c);
		return c;
	}
}