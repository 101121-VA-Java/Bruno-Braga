package com.revature.models;

import com.revature.interfaces.Trimester;

public class Summer extends Season implements Trimester { // example of inheritance

	int avergeTemperature = 75;

    public Summer() {
    
    }

    public String typeOfTemperature(String seasonName){
		return seasonName;
    	
    }

    public String changesTemperatures(int averageTemperature) { 
    	return "Temperature average is" +  averageTemperature;
    }
    
    public Summer(String seasonName) { // default constructor
        super();
    }


     public void harshWeather(){
        System.out.println("Summer is harsh");
     }

}
