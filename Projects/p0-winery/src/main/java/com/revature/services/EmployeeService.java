package com.revature.services;

import com.revature.dao.EmployeeDao;
import com.revature.exception.LoginException;
import com.revature.exception.UsernameAlreadyExistsException;
import com.revature.models.Employee;
import com.revature.dao.EmployeePostgres;

import java.util.List;

public class EmployeeService {

	private static EmployeeDao ed = new EmployeePostgres();

	public Employee addEmployee(Employee employee) throws UsernameAlreadyExistsException {

		Employee newHire = EmployeeService.getEmployeeByUsername(employee.getUsername());
		if (newHire != null) {
			throw new UsernameAlreadyExistsException();
		}

		return ed.add(employee);
	}

	private static Employee getEmployeeByUsername(String username) {
		List<Employee> employees = ed.getAll();
		for (Employee e : employees) {
			if (e.getUsername().equals(username)) {
				return e;
			}
		}

		return null;
	}

	public static Employee login(String username, String password) throws LoginException {
		Employee emp = getEmployeeByUsername(username);
		if (emp == null || !emp.getPassword().equals(password)) {
			throw new LoginException();
		}
		return emp;
	}

}