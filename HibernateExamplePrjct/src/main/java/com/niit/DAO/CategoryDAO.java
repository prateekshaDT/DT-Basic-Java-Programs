package com.niit.DAO;

import java.util.List;
import java.util.Locale.Category;

public interface CategoryDAO {
	
	public List<Category> list();
	public Category get(int id);
	public boolean save(com.niit.model.Category category);
	public boolean update(com.niit.model.Category category);

}
