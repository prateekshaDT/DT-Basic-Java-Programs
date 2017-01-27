package com.niit.DAOImpl;



import org.hibernate.HibernateException;
import org.hibernate.Query;
//import com.niit.service.OrderService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CartDao;
import com.niit.model.Cart;

import java.io.IOException;

@Repository
@Transactional
public class CartDaoImpl implements CartDao{

    @Autowired
    private SessionFactory sessionFactory;

   /* @Autowired
    private OrderService orderService;*/

    public Cart getCartById (int cartId) {
        Session session = sessionFactory.openSession();
        
        return (Cart) session.get(Cart.class, cartId);
    }

    public void update(Cart cart) {
		
		Session session = sessionFactory.openSession();
		try {
			cart.setGrandTotal(3.33);
			session.update(cart);
			session.flush();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

 public Cart validate(int cartId) throws IOException {
        Cart cart=getCartById(cartId);
        if(cart==null||cart.getCartItems().size()==0) {
            throw new IOException(cartId+"");
        }
        update(cart);
        return cart;
    }
 }
