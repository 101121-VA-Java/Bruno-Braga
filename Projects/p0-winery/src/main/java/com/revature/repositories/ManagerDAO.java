package com.revature.repositories;

import com.revature.models.Manager;

public interface ManagerDAO {
	
	void createEmployee();
	void removeEmployee();
	SalesHistoryArray viewSalesHistory();
}
