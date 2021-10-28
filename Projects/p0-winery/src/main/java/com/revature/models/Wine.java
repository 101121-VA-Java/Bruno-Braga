package com.revature.models;

public class Wine {

	private String brand;
	private String name;
	private Kind kindOfWine;
	
	public Wine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wine(String brand, String name, Kind kindOfWine) {
		super();
		this.brand = brand;
		this.name = name;
		this.kindOfWine = kindOfWine;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		return "Wine [brand=" + brand + ", name=" + name + ", kindOfWine=" + kindOfWine + ", hashCode()=" + hashCode()
				+ ", getBrand()=" + getBrand() + ", getName()=" + getName() + ", getKindOfWine()=" + getKindOfWine()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
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
	public Kind getKindOfWine() {
		return kindOfWine;
	}
	public void setKindOfWine(Kind kindOfWine) {
		this.kindOfWine = kindOfWine;
	}
	
	
	
	
	
}
