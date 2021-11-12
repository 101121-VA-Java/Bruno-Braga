package com.revature.dao;

import com.revature.models.User;

import java.util.ArrayList;
import java.util.List;

public class UsersList extends UserPostgres{
   
    private List<User> users;

    public UsersList() {
        users = new ArrayList<>();

    }

    @Override
    public User add(User t) {
        t.setUserID(users.size());
        users.add(t);
        return t;
    }

    @Override
    public User getByID(int id) {
        for(User e: users) {
            if(e.getUserID() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public List<User> getAll(){
        return users;
    }

    @Override
    public boolean update(User t) {
        User temp = getByID(t.getUserID());
        if(temp == null || temp.equals(t)) {
            return false;
        }
        users.set(t.getUserID(), t);
        return true;
    }

    @Override
    public User remove(User t) {
        users.remove(t);
        return t;
    }
    
}
