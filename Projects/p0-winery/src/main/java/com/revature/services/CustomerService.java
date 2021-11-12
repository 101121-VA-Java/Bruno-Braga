package com.revature.services;

import com.revature.dao.CustomerDao;
import com.revature.dao.CustomerPostgres;
import com.revature.exceptions.UserAlreadyExistsException;
import com.revature.models.Customer;

import java.util.List;

public class CustomerService {

    private static CustomerDao cd = new CustomerPostgres();

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

    public Customer login(String email, String password) throws LoginException{
        Customer cstmrs = this.getCustomerByEmail(email);
        if(cstmrs == null || !cstmrs.getPassword().equals(password)) {
            throw new LoginException();
        }
        cstmrs.setLoggedIn(true);
        cd.update(cstmrs);
        return cstmrs;

    }


    public void logout() {
        List<Customer> customers = cd.getAll();
        for (Customer cstmrs : customers) {
            if(cstmrs.isLoggedIn()) {
                cstmrs.setLoggedIn(false);
                cd.update(cstmrs);
            }
        }
    }

}
