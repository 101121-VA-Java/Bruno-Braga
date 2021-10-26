package com.revature;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.*;

import com.revature.models.Customer;
import com.revature.repositories.CustomerArray;
import com.revature.repositories.CustomerDao;

public class CustomerDaoTest {
	
	private static CustomerDao cd;
	
	
	@BeforeEach
	public void setup() {
		Customer[] customers = {new Customer(0, "Kevin", "Kev", "KevPass")}; 
		cd = new CustomerArray(); //customer should be a parameter
	}
	
	@Test
	public void getAllCustomers(){
		Customer[] expected = {new Customer(0, "Kevin", "Kev", "KevPass")};
		Customer[] actual = cd.getAllCustomers();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void addCustomerValid() {
		Customer[] expected = {new Customer(0, "Kevin", "Kev", "KevPass"), 
								new Customer(1, "Kev", "K", "Pass") };
		
		// Adding an customer
		cd.addCustomer(new Customer(1, "Kev", "K", "Pass"));
		
		assertArrayEquals(expected, cd.getAllCustomers());
	}
}
