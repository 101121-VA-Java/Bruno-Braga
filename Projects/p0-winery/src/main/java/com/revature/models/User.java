package com.revature.models;

import java.util.Objects;

public class User {


    private int UserID;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String email;
    private int typeID;
    private boolean loggedin;

    public User() {
        super();
    }

    public User(int userID, String first_name, String last_name, String username, String password, String email, int typeID, boolean loggedin) {
        UserID = userID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.typeID = typeID;
        this.loggedin = loggedin;
    }


    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public boolean isLoggedin() {
        return loggedin;
    }

    public void setLoggedin(boolean loggedin) {
        this.loggedin = loggedin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserID() == user.getUserID() && getTypeID() == user.getTypeID() && isLoggedin() == user.isLoggedin() && getFirst_name().equals(user.getFirst_name()) && getLast_name().equals(user.getLast_name()) && getUsername().equals(user.getUsername()) && getPassword().equals(user.getPassword()) && getEmail().equals(user.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getFirst_name(), getLast_name(), getUsername(), getPassword(), getEmail(), getTypeID(), isLoggedin());
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", typeID=" + typeID +
                ", loggedin=" + loggedin +
                '}';
    }
}