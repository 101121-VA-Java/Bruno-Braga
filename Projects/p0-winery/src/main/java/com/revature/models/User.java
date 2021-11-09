package com.revature.models;

public class User {


    private int UserID;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String email;
    private String typeID;
    private String loggedin;

    public User() {
        super();
    }

    public User(int userID, String first_name, String last_name, String username, String password, String email, String typeID, String loggedin) {
        UserID = userID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.typeID = typeID;
        this.loggedin = loggedin;
    }



}