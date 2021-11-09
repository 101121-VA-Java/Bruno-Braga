package com.revature.services;

import com.revature.controllers.CustomerController;
import com.revature.controllers.EmployeeController;
import com.revature.controllers.ManagerController;
import com.revature.controllers.RegisterUserController;
import com.revature.exceptions.LoginException;
import com.revature.models.User;
import com.revature.dao.GenericDao;
import com.revature.repositories.UserPostgres;

import java.util.List;

public class UsersServices {
    private static final GenericDao<User> us = new UserPostgres();


    public User getUserByEmail(String email) {
        List<User> user = us.getAll();
        for(User u : user) {
            if(u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }

    public void loginUser(String username, String password) throws LoginException {
        User u = this.getUserByEmail(username);
        if(u == null|| !u.getPassword().equals(password)) {
//            throw new LoginException();
            RegisterUserController.registerUserMenu();
            System.out.println("Invalid username or password");

        } else {
            u.getPassword();
        }

            switch() {
                case 0:
                    ManagerController.ManagerMenu();
                    break;
                case 1:
                    EmployeeController.employeeMenu();
                    break;
                case 2:
                    CustomerController.customerMainMenu();
                    break;
            }
    }

    public boolean updateUser(User user) {
        return us.update(user);
    }
}
