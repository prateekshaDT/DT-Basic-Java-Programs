package com.niit.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.ShippingDetailDAO;
import com.niit.model.Cart;


import com.niit.model.Shipping;
import com.niit.model.UsersDetail;

@Repository("ShippingDetailDAO")

public class ShippingDetailDAOImpl implements ShippingDetailDAO{

    @Autowired
    private SessionFactory sessionFactory;

    
    @Transactional
    public void addShipping(Shipping shipping) {
    	
        Session session = sessionFactory.openSession();
        
        session.saveOrUpdate(shipping);
       
        Shipping newShipping = new Shipping();
        newShipping.setUsername(shipping.getUsername());
        
        newShipping.setUserId(shipping.getUserId());

        
        
        session.saveOrUpdate(shipping);
       
       /* Cart newCart = new Cart();
        newCart.setShipping(shipping);
        shipping.setCart(newCart);
        session.saveOrUpdate(shipping);
        session.saveOrUpdate(newCart);*/
       
        session.flush();
    }

    
   //LOOK HERE
    @Transactional
    public boolean isValidUser(String name)
    {
    	//select * from UserDetails where id='101' and password='niit'
    	String hql="from Shipping where username='"+name+"'";
    	Query query=sessionFactory.openSession().createQuery(hql);
    	
    	List<Shipping> list = query.list();//list of users detail
    	
    	if(list!=null){
        	return false;//invalid user    		
    	}
    	else{
    		return true;//valid user
    	}
    }
    
    @Transactional
    public Shipping getUserById (int userId) {
        Session session = sessionFactory.openSession();
        return (Shipping) session.get(Shipping.class, userId);
    }
    @Transactional
    public List<Shipping> getAllUsers() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Shipping");
        List<Shipping> shipping = query.list();

        return shipping;
    }
    @Transactional
    public Shipping getShippingByUsername (String username) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Shipping where username = ?");
        query.setString(0, username);
        return (Shipping) query.uniqueResult();
    }


	public void addUser(Shipping shipping) {
		// TODO Auto-generated method stub
		
	}


	public Shipping getShippingById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Shipping> getAllShipping() {
		// TODO Auto-generated method stub
		return null;
	}


	public UsersDetail getUserByUsername(String shipping) {
		// TODO Auto-generated method stub
		return null;
	}
}