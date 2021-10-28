package com.revature.daos;

import com.revature.models.Employee;

public interface EmployeeDAO {

	int addItemCatalog();
	int deleteItemCatalog();
	boolean acceptRejectOffer();
	Employee[] getAllEmployees(); // returns an array of all of the employees available
	Employee getEmployeeById(int id);
	int addEmployee(Employee e); // returns assigned id
	boolean editEmployee(Employee e); // returns boolean depending on operation success
	boolean deleteEmployee(int id); // returns boolean depending on operation success

}
