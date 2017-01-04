package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.SupplierDAO;
import com.niit.model.Supplier;

@Repository("supplierDAOImpl")
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory; 
	
	public  SupplierDAOImpl(SessionFactory sessionFactory )
	{
		this.sessionFactory = sessionFactory; 
		System.out.println(sessionFactory);
	}

	public List<Supplier> list() {
		
		String hql="from Supplier";
		Query query =	sessionFactory.getCurrentSession().createQuery(hql);
		
		 return query.list();
		
	}

	public Supplier get(int id) {
	
		return(Supplier) sessionFactory.getCurrentSession().get(Supplier.class,id);
	}

	public boolean save(Supplier supplier) {
	
		try {
			sessionFactory.getCurrentSession().save(supplier);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

	public boolean update(Supplier supplier) {
		
		try {
			sessionFactory.getCurrentSession().update(supplier);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

	

	}


