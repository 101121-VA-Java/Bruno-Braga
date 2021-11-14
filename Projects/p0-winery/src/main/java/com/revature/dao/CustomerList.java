//package com.revature.dao;
//
//import com.revature.models.Customer;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CustomerList implements GenericDao<Customer> {
//
//	private List<Customer> customers = new ArrayList<>();
//
//	@Override
//	public Customer add(Customer t) {
//		t.setId(customers.size());
//		customers.add(t);
//		return t;
//	}
//
//	public Customer getById(int id) {
//		for (Customer c : customers) {
//			if (c.getId() == id) {
//				return c;
//			}
//		}
//		return null;
//	}
//
//	@Override
//	public List<Customer> getAll() {
//		return customers;
//
//	}
//
//	@Override
//	public boolean update(Customer t) {
//		Customer temp = getById(t.getId());
//		if (temp == null || temp.equals(t)) {
//			return false;
//		}
//		customers.set(t.getId(), t);
//		return true;
//	}
//
//	@Override
//	public Customer delete(Customer t) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Customer getByID(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//}