package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Category;

public interface CategoryDAO {
	
	public void saveOrUpdate(Category category);
	

	public void delete(String id);

	public Category get(String id);

	public List<Category> list();

}