package com.revature.driver;


import java.util.Scanner;

import com.revature.models.*;


public class Driver {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
   
        System.out.println("What is your favorite season of the year ?");
        String mySc = sc.nextLine();
        Season s = new Summer(); 
        
        System.out.println("Your favorite season is "+ s.typeOfWeather(mySc));
        mySeasonTemperature(s.averageTemperature(mySc));
        sc.close();
        
        
    }
    
    public static void mySeasonTemperature(int temperature) {
    	System.out.println("Temperature average for your season is " + temperature);
    	
    }
    
    
    
}
