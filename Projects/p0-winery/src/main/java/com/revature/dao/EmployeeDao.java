package com.revature.dao;

import java.util.List;

import com.revature.models.Employee;

public interface EmployeeDao extends GenericDao<Employee> {

	String deleteEmployee(int idNewEmp);

	String updateEmployee(Employee newEmp2);

	int addEmployee(Employee newEmp);

}
