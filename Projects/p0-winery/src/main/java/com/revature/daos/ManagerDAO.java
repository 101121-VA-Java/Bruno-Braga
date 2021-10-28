package com.revature.daos;

import com.revature.models.Manager;
import com.revature.repositories.SalesHistoryArray;

public interface ManagerDAO {
	
	void createEmployee();
	void removeEmployee();
	SalesHistoryArray viewSalesHistory();
	Manager getManagerById(int id);
}
