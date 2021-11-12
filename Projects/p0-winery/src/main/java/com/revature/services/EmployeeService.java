package com.revature.services;

import com.revature.exceptions.UserAlreadyExistsException;
import com.revature.models.Employee;
import com.revature.dao.EmployeePostgres;
import com.revature.dao.GenericDao;

import java.util.List;

public class EmployeeService {
    private static GenericDao<Employee> ed = new EmployeePostgres();

    public GenericDao<Employee> addEmployee(Employee e) throws UserAlreadyExistsException {
        Employee newEmployee = this.getEmployeeByEmail(e.getEmail());
        if(newEmployee != null) {
            throw new UserAlreadyExistsException();
        }
        return (GenericDao<Employee>) ed.add(e);
    }

    public Employee getEmployeeByEmail(String email) {
        List<Employee> employees = es.getAll();
        for(Employee e : employees) {
            if(e.getEmail().equals(email)) {
                return e;
            }
        }
        return null;
    }

}