package com.revature.repositories;

import com.revature.daos.EmployeeDAO;
import com.revature.models.Employee;

public class EmployeePostgres implements EmployeeDAO{

	

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int addItemCatalog() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItemCatalog() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean acceptRejectOffer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee[] getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean editEmployee(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

}
