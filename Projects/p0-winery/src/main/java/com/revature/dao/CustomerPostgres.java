package com.revature.dao;

import com.revature.models.Customer;
import com.revature.utilities.ConnectionUtil;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerPostgres implements CustomerDao {

    @Override
    public Customer getByID(int customerID) {
        String sql = "select * from winery.customers where c_id = ? ";
        Customer cust = null;

        try(Connection con = ConnectionUtil.getConnectionFromFile()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, customerID);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                int c_id = rs.getInt("c_id");
                String c_first_name = rs.getString("c_first_name");
                String c_last_name = rs.getString("c_first_name");
                String c_email = rs.getString("c_email");
                String c_password = rs.getString("c_password");
                boolean loggedIn = rs.getBoolean("c_logged_in");


                cust = new Customer(c_id, c_first_name, c_last_name, c_email, c_password, loggedIn);
            }
        }
        catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return cust;
    }

    @Override
    public List<Customer> getAll(){
        String sql = "select * from winery.customers;";
        List <Customer> customers = new ArrayList<>();

        try (Connection con = ConnectionUtil.getConnectionFromFile()){
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while(rs.next()) {
                int customerID = rs.getInt("c_id");
                String firstName = rs.getString("c_first_name");
                String lastName = rs.getString("c_last_name");
                String email = rs.getString("c_email");
                String password = rs.getString("c_password");
                boolean loggedIn = rs.getBoolean("c_logged_in");

                Customer newCstmr = new Customer(customerID, firstName, lastName, email, password, loggedIn);
                customers.add(newCstmr);
            }
        }
        catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public Customer add(Customer customer) {
        // int genID = -1;
        String sql = "insert into winery.customers (c_first_name, c_last_name, c_email, c_password) values (?, ?, ?, ?);";

        try (Connection con = ConnectionUtil.getConnectionFromFile()){
            PreparedStatement ps = con.prepareStatement(sql);


            ps.setString(1, customer.getFirstName());
            ps.setString(2, customer.getLastName());
            ps.setString(3, customer.getEmail());
            ps.setString(4, customer.getPassword());
            ps.setInt(5, customer.getCustomerID());

            ResultSet rs = ps.executeQuery();
            ps.executeUpdate();

			if(rs.next()) {
                int genID = rs.getInt("e_id");
			}
        }
        catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public boolean update(Customer customer) {
        String sql = "update winery.customers set c_first_name = ?, c_last_name = ?, c_email = ?, c_password = ?, "c_logged" = ? where c_id = ?;";


        try (Connection con = ConnectionUtil.getConnectionFromFile()){
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, customer.getFirstName());
            ps.setString(2, customer.getLastName());
            ps.setString(3, customer.getEmail());
            ps.setString(4, customer.getPassword());
            ps.setBoolean(5, customer.isLogged());
            ps.setInt(6, customer.getCustomerID());

            ps.executeUpdate();
        }
        catch (SQLException | IOException e) {
            e.printStackTrace();
        }

}