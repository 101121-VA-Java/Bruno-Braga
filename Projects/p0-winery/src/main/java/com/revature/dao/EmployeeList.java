//package com.revature.dao;
//
//import com.revature.models.Employee;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class EmployeeList implements GenericDao<Employee> {
//
//    private List<Employee> employees;
//
//    public EmployeeList() {
//        employees = new ArrayList<>();
//
//    }
//
//    @Override
//    public Employee add(Employee t) {
//        t.setEmployeeID(employees.size());
//        employees.add(t);
//        return t;
//    }
//
//    @Override
//    public Employee getByID(int id) {
//        for(Employee e: employees) {
//            if(e.getEmployeeID() == id) {
//                return e;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<Employee> getAll(){
//        return employees;
//    }
//
//    @Override
//    public boolean update(Employee t) {
//        Employee temp = getByID(t.getEmployeeID());
//        if(temp == null || temp.equals(t)) {
//            return false;
//        }
//        employees.set(t.getEmployeeID(), t);
//        return true;
//    }
//
//    @Override
//    public Employee delete(Employee t) {
//        employees.remove(t);
//        return t;
//    }
//}
