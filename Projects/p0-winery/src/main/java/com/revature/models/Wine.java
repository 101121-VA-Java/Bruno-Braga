package com.revature.models;

enum Kind {
	RED, WHITE, ROSE
}
public class Wine {

	private String brand;
	private String name;

	
	public Wine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wine(String brand, String name, Kind kindOfWine) {
		super();
		this.brand = brand;
		this.name = name;

	}

    public static void catalogOfWines() {

//		System.out.println(getWines(brand, name, kindOfWine));
    }


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
