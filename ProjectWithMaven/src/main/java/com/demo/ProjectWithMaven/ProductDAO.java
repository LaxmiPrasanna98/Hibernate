package com.demo.ProjectWithMaven;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductDAO {
	private SessionFactory sessionFactory;
	public ProductDAO() {
		sessionFactory=Utility.getSessionFactory();
		
	}
	private Session getSession() {
		return sessionFactory.openSession();
		
	}
	public void save(Product p) {
		Session session=getSession();
		Transaction tx=session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

}
