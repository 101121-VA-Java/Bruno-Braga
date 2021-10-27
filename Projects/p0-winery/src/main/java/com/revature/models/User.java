package com.revature.models;

public class User {

	Role typeOfRole;
	public int userId;
	public String name;
	public String username;
	public String password;
	
	//TODO: set return type
	void registerUser(){
		
	}
	
	//TODO: set return type
	void userLogin(){
		
	}
	
	//TODO: set return type
	void userLogout(){
		
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public User(int userId, String name, String username, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.username = username;
		this.password = password;
	}


}
	
	
