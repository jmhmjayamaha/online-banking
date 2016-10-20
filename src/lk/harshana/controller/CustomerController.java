package lk.harshana.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import lk.harshana.model.Customer;

public class CustomerController {

	private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public static List<Customer> getCustomerList(String username) {
		List<Customer> list = new ArrayList<Customer>();
		Session session = sessionFactory.openSession();
		Transaction t = null;
		try {
			t = session.beginTransaction();

			list = session.createQuery("from Customer where username='"+username+"'").list();
			t.commit();

		} catch (HibernateException e) {
			if (t != null) {
				t.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
