package com.revature.dao;

import java.util.List;



public interface GenericDao<T> {
    T add(T t);
    T getByID(int id);
    List<T> getAll();
    boolean update(T t);
    T delete (T t);
}
