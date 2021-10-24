package com.revature.models;

public class Winter { // example of inheritance using the extends keyword to abstract the class HashWeather
    public String[] winterMonths = {"December", "January", "February"};






    boolean threeMonths(String month) { // example of overriding a method
        if (month.equals("March")) {
            return false;
        }
        return true;
    }
    
    public void threeMonths(){
        System.out.println("The weather is going to be very harsh for the next three months");
    }

}
