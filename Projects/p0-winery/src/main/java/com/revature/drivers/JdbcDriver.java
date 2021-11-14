

package com.revature.drivers;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.DriverManager;
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

	public static Object main(String[] args) {
//	public static void main(String[] args) {
		CustomerDao cd = new CustomerPostgres();
		List<Customer> cus = cd.getAll();
		for (Customer c : cus) {
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getUsername());
			System.out.println(c.getPassword());

		}
		return cus;
	}
}



 