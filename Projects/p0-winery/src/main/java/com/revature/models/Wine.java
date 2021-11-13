package com.revature.models;

import java.util.Objects;

public class Wine {
	
	private String description;
	private int quantity;
	private double price;
	private int cusID;
	private String status;
	


	public Wine() {
		super();

	}

	public Wine(String description, int quantity, double price, int cusID, String status) {
		super();
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.cusID = cusID;
		this.status = status;
	}

	public Wine(String description, int quantity, double price) {
		super();
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public Wine(String description, int quantity, double price, String status) {
		super();
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
	}

	public Wine(String description, int quantity, double price, int cusID) {
		super();
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.cusID = cusID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Item [description=" + description + ", quantity=" + quantity + ", price=" + price + ", cusID=" + cusID
				+ ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cusID, description, price, quantity, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wine other = (Wine) obj;
		return cusID == other.cusID && Objects.equals(description, other.description)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity
				&& Objects.equals(status, other.status);
	}


}
