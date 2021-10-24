package com.revature.driver;


import java.util.Scanner;

import com.revature.models.*;


public class Driver {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
   
        System.out.println("What is your favorite season of the year");
        String mySc = sc.nextLine();
        Season s = new Summer(); 
        
        System.out.println("Your favorite season is "+ s.typeOfWeather(mySc));
        sc.close();
//        averageTemperature();
        
    }
    
    public static void averageTemperature(String temperature) {
//    	switch(temperature) {
//    	case "Summer":    	}
    	System.out.println("Temperature average for you season is " + temperature);
    	
    }
    
    
    
}
