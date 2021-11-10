package com.revature.services;

import com.revature.dao.GenericDao;
import com.revature.exceptions.UserAlreadyExistsException;
import com.revature.models.Customer;
import com.revature.models.Wine;
import com.revature.repositories.CustomerPostgres;

import java.util.List;

public class CustomerService {

    private static GenericDao<Customer> cd = new CustomerPostgres();

    public Customer addCustomer(Customer c) throws UserAlreadyExistsException{
        Customer newCustomer = this.getCustomerByEmail(c.getEmail());
        if(newCustomer != null) {
            throw new UserAlreadyExistsException();
        }
        return cd.add(c);
    }

    public Customer getCustomerByEmail(String email) {
        List<Customer> customers = cd.getAll();
        for(Customer c : customers) {
            if(c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }


    public void logout() {
        List<Customer> customers = cd.getAll();
        for (Customer cust : customers) {
            if(cust.isLoggedIn() == true) {
                cust.setLoggedIn(false);
            }
        }
    }
    public void viewWineCatalog(){
        System.out.println("Viewing Catalog");
        List<Wine> wines = cd.getAll();
        for(Wine w : wines) {
            System.out.println(w);
        }
    }
}
