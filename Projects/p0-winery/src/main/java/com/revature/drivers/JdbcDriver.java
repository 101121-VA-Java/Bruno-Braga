package com.revature.drivers;

import java.util.List;
import com.revature.dao.CustomerDao;
import com.revature.dao.EmployeeDao;
import com.revature.dao.ItemDao;
import com.revature.dao.CustomerPostgres;
import com.revature.dao.EmployeePostgres;
import com.revature.dao.ItemPostgres;
import com.revature.models.Customer;
import com.revature.models.Employee;
import com.revature.models.Item;

public class JdbcDriver {

	public static void main(String[] args) {
		EmployeeDao ed = new EmployeePostgres();
		List<Employee> emps = ed.getAll();
		for (Employee e : emps) {
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getUsername());
			System.out.println(e.getPassword());

		}
		CustomerDao cd = new CustomerPostgres();
		List<Customer> cus = cd.getAll();
		for (Customer c : cus) {
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getUsername());
			System.out.println(c.getPassword());

		}
		ItemDao id = new ItemPostgres();
		List<Item> item = id.getAll();
		for (Item i : item) {
			System.out.println(i.getDescription());
			System.out.println(i.getQuantity());
			System.out.println(i.getPrice());
			System.out.println(i.getCusId());
			System.out.println(i.getStatus());
		}
	}
}
