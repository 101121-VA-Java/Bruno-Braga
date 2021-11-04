package com.revature.models;

public class Employee implements User {


	public int employeeId;
	private String employeeName;
	private String username;
	private String password;
	public Role role; // using an Enum to store a specific value
	private double salary;
	

	
	public Employee(int employeeId, String employeeName, String username, String password, Role role, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.username = username;
		this.password = password;
		this.role = role;
		this.salary = salary;
	}

	public Employee(int id, String lastname, String firstname, double salary) {
		// TODO Auto-generated constructor stub
	}

	public Double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	
	
	
	
}
