package com.revature.services;

import com.revature.daos.EmployeeDAO;
import com.revature.models.Employee;


public class EmployeeService {

	private EmployeeDAO ed;
	
	public int addEmployee(Employee e) {
		/*
		 * add business logic here to manipulate e before storage
		 */
		return ed.addEmployee(e);
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
