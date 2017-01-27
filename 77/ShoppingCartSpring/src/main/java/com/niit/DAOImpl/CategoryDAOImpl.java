/*package com.niit.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;


	public CategoryDAOImpl( ) {
			
	}
	
	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;		
	}

	@Transactional
	public Category get(String id) {


		String hql = "from Category where id='" + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) query.list();

		if (listCategory != null && !listCategory.isEmpty()) {
			System.out.println("no product is available with this id :" + id);

			return listCategory.get(0);
		}

		return null;
	}
	
	@Transactional
	public Category getByName(String name) {
		
		String hql = "from Category where name='" + name + "'";

		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) query.list();

		if (listCategory != null && !listCategory.isEmpty()) {
			
			return listCategory.get(0);
		}

		return null;
	}
	
	@Transactional
	public boolean saveOrUpdate(Category category) {
		
		if(category!=null){
			System.out.println("category is not null");
			System.out.println(category.getName());
		}
		else{
			System.out.println("category is null");
		}
		
		try {
			
			System.out.println("Inside saveOrUpdate method ");
			//sessionFactory.getCurrentSession().saveOrUpdate(category);
			System.out.println("Inside saveOrUpdate method ;lllllll");
			sessionFactory.openSession().saveOrUpdate(category);
			//sessionFactory.getCurrentSession().flush();
		
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Inside saveOrUpdate catch ");
			
			e.printStackTrace();
			return false;
		}
	}


	@Transactional
	public boolean delete(String id) {
		try {
			Category categoryToDelete = new Category();
			categoryToDelete.setId(id);
		
			sessionFactory.getCurrentSession().delete(categoryToDelete);
			sessionFactory.getCurrentSession().flush();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	

	
	
	
	@Transactional
	public List<Category> list() {

		String hql = "from Category ORDER BY ID ASC";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Category> list = query.list();
		if (list == null || list.isEmpty()) {
			System.out.println("No products are available");
		}
		return list;
	}
}
*/

package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	
	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;	
		System.out.println("inside session constructor");
		//sessionFactory = new Configuration().configure().buildSessionFactory();
		
	}

	@Transactional
	public Category get(String id) {

	
		String hql = "from Category where id='" + id + "'";
		Session session = sessionFactory.openSession();		
		Query query = session.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) query.list();
		if (listCategory != null && !listCategory.isEmpty()) {			
			return listCategory.get(0);
		}
		return null;
	}

	@Transactional
	public Category getByName(String name) {

		String hql = "from Category where name='" + name + "'";
		
		
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) query.list();

		if (listCategory != null && !listCategory.isEmpty()) {
		
			return listCategory.get(0);
		}

		return null;
	}
	
	@Transactional
	public boolean saveOrUpdate(Category category) {
		
		try {
			System.out.println("inside save or update");
			Session session = sessionFactory.openSession();
			session.saveOrUpdate(category); 
			session.flush();
					
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
			return false;
		}
	}


	@Transactional
	public boolean delete(String id) {
		try {
			Category categoryToDelete = new Category();
			categoryToDelete.setId(id);
			Session session = sessionFactory.openSession();
			session.delete(categoryToDelete);
			session.flush();
			
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
			return false;
		}
	}

	
	@Transactional
	public List<Category> list() {

		
		String hql = "from Category ORDER BY ID ASC";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		List<Category> list = query.list();
		if (list == null || list.isEmpty()) {
		System.out.println("list is empty");
		}
		
		return list;
	}
}
