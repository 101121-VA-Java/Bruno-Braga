package com.revature.models;

import com.revature.interfaces.*;

import java.util.Arrays;

public class Season implements Trimester {
	public String weather;
	public int averageTemperature;
	public String seasonName;
	String[] fourSeasonNames = { "Summer", "Fall", "Winter", "Spring" };
	String[] fourSeasonWeather = { "Sunny", "Rainy", "Snowy", "Cloudy" };
	int[] fourSeasonTemperatures = { 75, 55, 45, 65 };

	public Season() {
	}

	public Season(String seasonName, String weather, int averageTemperature) {
		this.seasonName = seasonName;
		this.weather = weather;
		this.averageTemperature = averageTemperature;
	}

	public String typeOfWeather(String seasonName) {
		this.seasonName = seasonName;
		
		switch (seasonName) {
		case "Summer":
			seasonName = "Sunny";
			return seasonName;
		case "Fall":
			seasonName = "Rainy";
			return seasonName;
		case "Winter":
			seasonName = "Snowy";
			return seasonName;
		case "Spring":
			seasonName = "Cloudy";
			return seasonName;
		default:
			throw new IllegalStateException("Unexpected value: " + Arrays.toString(fourSeasonNames));
		}
	}

	public void weatherChange(String weather) {
		this.weather = weather;
	}

	public int averageTemperature(String seasonName) {
		switch (seasonName) {
		case "Summer":
			return 75;
		case "Fall":
			return 55;
		case "Winter":
			return 45;
		case "Spring":
			return 65;
		default:
			throw new IllegalStateException("Unexpected value: " + Arrays.toString(fourSeasonTemperatures));
			
		}
	}
	
	
	
}
