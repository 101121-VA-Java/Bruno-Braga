package com.revature.repositories;

import com.revature.dao.GenericDao;
import com.revature.models.User;
import com.revature.utilities.ConnectionUtil;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserPostgres implements GenericDao<User> {

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User getByID(int id) {
                String sql = "select * from users where id = ? ";
                User user = null;

                try(Connection con = ConnectionUtil.getConnectionFromFile()){
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setInt(1, id);
                    ResultSet rs = ps.executeQuery();

                    if(rs.next()) {
                        int userId = rs.getInt("user_id");
                        String username = rs.getString("username");
                        String first_name = rs.getString("first_name");
                        String last_name = rs.getString("last_name");
                        String email = rs.getString("email");
                        String password = rs.getString("password");
                        int roleId = rs.getInt("roleId");
                        boolean loggedIn = rs.getBoolean("loggedIn");


                        user = new User(
            }
        }catch (SQLException | IOException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public List<User> getAll() {
        String sql = "select * from users;";
        List <User> users = new ArrayList<>( );

        try (Connection con = ConnectionUtil.getConnectionFromFile()){
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while(rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                int roleId = rs.getInt("roleId");


                User newUser = new User(id, , username, first_name, last_name, email, password, roleId);
                users.add(newUser);
            }
        }
        catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User remove(User user) {
        return null;
    }
}
