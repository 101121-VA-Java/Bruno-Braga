package com.revature.services;

import com.revature.models.Employee;
import com.revature.repositories.EmployeeDao;

public class EmployeeService {

	private EmployeeDAO ed;
	
	public int addEmployee(Employee e) {
		/*
		 * add business logic here to manipulate e before storage
		 */
		return ed.addEmployee(e);
	}

	public Employee getEmployeeById(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
