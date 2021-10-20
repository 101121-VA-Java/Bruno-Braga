package com.revature.main;
import com.revature.human.Human;

public class Main{
    public static void main(String[] args){

        Human man = new Human();
        man.age = 40;
        System.out.println(man.age + " years old man");
        int myPace = man.walk(30);
	    System.out.println("This man walked " + man.walk(10) + " and " +myPace +" steps " );
	



    }
}
