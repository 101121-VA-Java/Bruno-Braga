package com.revature;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerDAOTest {

	
	@BeforeEach
	public void setup() {
		Manager[] managers = {new Manager(0, "Kevin", "Kev", "KevPass",Role.MANAGER, null)}; 

		md = new ManagerArray(managers);
	}
	
	@Test
	public void getAllManagers(){
		Manager[] expected = {new Manager(0, "Kevin", "Kev", "KevPass",Role.MANAGER, null)};
		Manager[] actual = md.getAllManagers();
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void addManagerValid() {
		Manager[] expected = {new Manager(0, "Kevin", "Kev", "KevPass",Role.MANAGER, null), 
								new Manager(1, "Kev", "K", "Pass",Role.MANAGER, null) };
		
		// Adding an Manager
		md.addManager(new Manager(1, "Kev", "K", "Pass",Role.MANAGER, null));
		
		assertArrayEquals(expected, md.getAllManagers());
	}
}
