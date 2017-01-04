package com.niit.DAOImpl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;

@Repository("productDAOImpl")
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	public  ProductDAOImpl(SessionFactory sessionFactory )
	{
		this.sessionFactory = sessionFactory;
		System.out.println(sessionFactory);
	}

	public List<Product> list() {
		
		String hql="from Product";
		Query query =	sessionFactory.getCurrentSession().createQuery(hql);
		
		 return query.list();
		}

	public Product get(int id) {
		
		return(Product) sessionFactory.getCurrentSession().get(Product.class,id);
	}

	public boolean save(Product product) {

		try {
			sessionFactory.getCurrentSession().save(product);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	public boolean update(Product product) {
		
		try {
			sessionFactory.getCurrentSession().update(product);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

	

}
