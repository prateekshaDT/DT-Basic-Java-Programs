package com.niit.DAO;

import java.util.List;

import com.niit.model.Category;


public interface CategoryDAO {
	
	public List<Category> list();
	public Category get(int id);
	public boolean save( Category category);
	public boolean update(Category category);

}
