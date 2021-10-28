package com.revature.daos;

import java.util.ArrayList;

import com.revature.models.Customer;
import com.revature.models.PaymentsHistory;

public interface CustomerDAO {

	public String viewProductDescripton();
	public String viewIfItemHasOffers();
	public Double getTotalBalance();
	public Double makePayments();
	ArrayList<PaymentsHistory> viewPayments();

	public int addCustomer(Customer c);	
}
