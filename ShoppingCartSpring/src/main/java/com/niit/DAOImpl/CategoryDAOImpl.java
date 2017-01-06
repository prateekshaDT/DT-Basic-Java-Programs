package com.niit.DAOImpl;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

@Repository("categoryDAOImpl")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	public  CategoryDAOImpl(SessionFactory sessionFactory )
	{
		this.sessionFactory = sessionFactory; 
		System.out.println(sessionFactory);
	}
	
    @Transactional
	public List<Category> list() {
		
		
		String hql="from Category";
	Query query =	sessionFactory.getCurrentSession().createQuery(hql);
	
	 return query.list();
	}
    
    @Transactional
	public Category get(int id) {

		return(Category) sessionFactory.getCurrentSession().get(Category.class,id);
	}

    @Transactional
	public boolean save(Category category) {
		
		try {
			sessionFactory.getCurrentSession().save(category);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();;
			return false;
		}
	
		return true;
	}

    @Transactional
	public boolean update(Category category) {
		
		try {
			sessionFactory.getCurrentSession().update(category);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		
		return true;
	}

}