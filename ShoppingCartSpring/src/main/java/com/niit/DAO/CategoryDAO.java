package com.niit.DAO;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDAO {

	public Category get(String id);

	public Category getByName(String name);

	public boolean saveOrUpdate(Category category);

	public boolean delete(String id);

	public List<Category> list();

}
