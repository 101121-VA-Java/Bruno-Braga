package com.revature.dao;

import com.revature.models.Employee;
import com.revature.utilities.ConnectionUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeePostgres implements EmployeeDao {

	@Override
	public List<Employee> getAll() {
		String sql = "select * from employees;";
		List<Employee> employees = new ArrayList<>();

		try (Connection con = ConnectionUtil.getConnectionFromFile()) {
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(sql);

			while (rs.next()) {
				String username = rs.getString("e_username");
				String password = rs.getString("e_password");

				Employee newEmp = new Employee(username, password);
				employees.add(newEmp);
			}
		} catch (IOException | SQLException e1) {

			e1.printStackTrace();
		}
		return employees;
	}

	

	public Employee getById(int id) {
		String sql = "select * from employees where e_id = ? ";
		Employee emp = null;

		try (Connection con = ConnectionUtil.getConnectionFromFile()) {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int e_id = rs.getInt("e_id");
				String e_name = rs.getString("e_name");
				String e_username = rs.getString("e_username");
				String e_password = rs.getString("e_password");

				emp = new Employee(e_id, e_name, e_username, e_password);

			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public Employee add(Employee employee) {

		String sql = "insert into employees (e_name, e_username, e_password) " + "values (?, ?, ?);";

		try (Connection con = ConnectionUtil.getConnectionFromFile()) {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, employee.getName());
			ps.setString(2, employee.getUsername());
			ps.setString(3, employee.getPassword());
			ps.executeUpdate();

		} catch (SQLException | IOException e1) {

			e1.printStackTrace();
		}

		return employee;
	}

	@Override
	public Employee delete(Employee employee) {
		String sql = "delete from employees where e_id = ?;";
		int rowsChanged = -1;
		int id = employee.getId();

		try (Connection con = ConnectionUtil.getConnectionFromFile();) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			rowsChanged = ps.executeUpdate();
		} catch (SQLException | IOException e) {

			e.printStackTrace();
		}
		if (rowsChanged > 0) {
			return null;
		} else {
			return employee;
		}
	}

	@Override
	public boolean update(Employee t) {

		return false;
	}

	@Override
	public Employee getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String deleteEmployee(int idNewEmp) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String updateEmployee(Employee newEmp2) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int addEmployee(Employee newEmp) {
		// TODO Auto-generated method stub
		return 0;
	}


}
