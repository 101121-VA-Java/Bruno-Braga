package com.revature.models;

public class User {

	public int userId;
	public String lastName;
	public String firstName;
	private String username;
	private String password;
	public Role role;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}



}