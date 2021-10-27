package com.revature.repositories;

import java.util.ArrayList;

import com.revature.models.PaymentsHistory;

public interface EmployeeDAO {

	int addItemCatalog();
	int deleteItemCatalog();
	boolean acceptRejectOffer();
	ArrayList<PaymentsHistory> viewPayments();
}
