package com.revature.repositories;

import java.util.Locale;
import java.util.Locale.Category;

import com.revature.exceptions.CatalogDAOSysException;
import com.revature.models.Item;
import com.revature.models.Page;
import com.revature.models.Product;

public interface CatalogDAO {

     
	public Category getCategory(String categoryID, Locale l) throws CatalogDAOSysException;     
	public Page getCategories(int start, int count, Locale l) throws CatalogDAOSysException;     
	public Product getProduct(String productID, Locale l)  throws CatalogDAOSysException;     
	public Page getProducts(String categoryID, int start, int count, Locale l) throws CatalogDAOSysException;     
	public Item getItem(String itemID, Locale l) throws CatalogDAOSysException;     
	public Page getItems(String productID, int start, int size, Locale l) throws CatalogDAOSysException;     
	public Page searchItems(String query, int start, int size, Locale l) throws CatalogDAOSysException;
}
