package com.revature.human;

public class Human{
    // fields
    public boolean alive;
    public int age;
    public int steps;

    public Human(){}
    public Human(int age, int steps){
        this.age = age;
        this.steps = steps;
    }
    
    // methods
    public static int walk(int steps){
        return steps++;
    }   
}
