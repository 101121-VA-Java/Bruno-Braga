package com.revature.dao;

import com.revature.models.Employee;
import com.revature.utilities.ConnectionUtil;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeePostgres implements GenericDao<Employee> {

    @Override
    public Employee getByID(int id) {
        String sql = "select * from employees where id = ? ";
        Employee emp = null;

        try(Connection con = ConnectionUtil.getConnectionFromFile()){
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();


            if(rs.next()) {
                int e_id = rs.getInt("e_id");
                String e_first_name = rs.getString("e_first_name");
                String e_last_name = rs.getString("e_first_name");
                String e_email = rs.getString("e_username");
                String e_password = rs.getString("e_password");


                emp = new Employee(id, username, first_name, last_name, email, password, logged);
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return emp;
    }

    @Override
    public List<Employee> getAll(){
        String sql = "select * from employees;";
        List <Employee> employees = new ArrayList<>();

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

                Employee newEmp = new Employee(id, username, first_name, last_name, email, password, roleId);
                employees.add(newEmp);
            }
        }
        catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public Employee add(Employee employee) {
        // int genID = -1;
        String sql = "insert into employees (Test_username, Test_first_name, Test_last_name, Test_email, Test_password, Test_roleId) "
                + "values (?, ?, ?, ?, ?, ?);";

        try (Connection con = ConnectionUtil.getConnectionFromFile()){
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, employee.getUsername());
            ps.setString(2, employee.getFirstName());
            ps.setString(3, employee.getLastName());
            ps.setString(4, employee.getEmail());
            ps.setString(5, employee.getPassword());
            ps.setInt(6, employee.getRoleId());

            //ResultSet rs = ps.executeQuery();
            ps.executeQuery();

//			if(rs.next()) {
//				genID = rs.getInt("e_id");
//			}
        }
        catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public boolean update(Employee employee) {
        String sql = "update employees set e_first_name = ?, e_last_name = ?, e_email = ?, e_password = ? "
                + "where e_id = ?;";

        int rowsChanged = -1;

        try (Connection con = ConnectionUtil.getConnectionFromFile()){
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getEmail());
            ps.setString(4, employee.getPassword());
            ps.setInt(5, employee.getEmployeeID());

            rowsChanged = ps.executeUpdate();
        }
        catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        if (rowsChanged > 0) {
            return true;
        } else {
            return false;
        }
    }

    public Employee remove(Employee employee) {
        String sql = "delete from employees where e_id = ?;";
        int rowsChanged = -1;
        int id = employee.getEmployeeID();
        try (Connection con = ConnectionUtil.getConnectionFromFile()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            rowsChanged = ps.executeUpdate();
        }
        catch (SQLException | IOException e){
            e.printStackTrace();
        }
        if(rowsChanged > 0) {
            return null;
        } else {
            return employee;
        }

    }
}
