package com.revature.repositories;

import com.revature.daos.ManagerDAO;
import com.revature.models.*;

public class ManagerArray implements ManagerDAO{

	private Manager[] Managers;
	
	public ManagerArray() {
		super();
	}
	public ManagerArray(Manager[] Managers) {
		this.Managers = Managers;
	}
	@Override
	public Manager[] getAllManagers() {
		return this.Managers;
	}

	@Override
	public Manager getManagerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addManager(Manager e) {
		
		// Create a temp array of size Managers + 1
		Manager[] temp = new Manager[Managers.length +1 ];
		
		int i = 0;
		
		for(; i < Managers.length; i++) {
			temp[i] = Managers[i];
		}
		/*
		 *  i is the value of the last index of the new array (Managers.length)
		 *  set i to be the id for the new Manager
		 */
		e.setId(i);
		
		// adding the new Manager to the array
		temp[i] = e;
		
		/*
		 * assign the newly created array to Managers
		 */
		Managers = temp;
		
		return i;
	}

	@Override
	public boolean editManager(Manager e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteManager(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void createEmployee() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public SalesHistoryArray viewSalesHistory() {
		// TODO Auto-generated method stub
		return null;
	}
}
