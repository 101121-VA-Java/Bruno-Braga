package com.revature.Task;

import java.util.Scanner;
import java.time.LocalDate;

public class Task {
	/*
	 * Create Task.class 
	 * 	- String name
	 * 	- LocalDate dueDate
	 * 	- encapsulate the class
	 *  - create setter and getter
	 *  - manually write at least one of them
	 *  - give a toString() and a .equals() method
	 */
//	LocalDate dueDate = new LocalDate();
	public String firstTaskName = "do Laundry";
	public String secondTaskName = "do the dishies";
	
 
    LocalDate d1 = LocalDate.parse("2011-09-01");
    
    public static void printDate() {
    	System.out.println("this is your first task due date: " + d1);  
    }


    LocalDate d2 = LocalDate.parse("2015-11-20");  
    System.out.println("this is your second task due date:  + d2); 
	

	
	
	
	
}
