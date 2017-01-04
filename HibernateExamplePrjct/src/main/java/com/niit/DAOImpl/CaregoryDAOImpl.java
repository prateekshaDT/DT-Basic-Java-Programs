package com.niit.DAOImpl;

import java.util.List;
import java.util.Locale.Category;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.CategoryDAO;

@Repository("categoryDAOImpl")
public class CaregoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	public void CategoryDAOImpl(SessionFactory sessionFactory )
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
		} catch (HibernateException e) {
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
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		
		return true;
	}

	public boolean save(com.niit.model.Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(com.niit.model.Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
