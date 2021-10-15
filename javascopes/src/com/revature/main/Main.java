package com.revature.main;
import com.revature.human.Human;

public class Main{
    public static void main(String[] args){

        Human man = new Human();
        int myPace = man.walk(30);
	    System.out.println("this man walked " + man.walk(10) + " and " +myPace +" steps " );
	



    }
}
