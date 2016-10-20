package lk.harshana.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import lk.harshana.model.Account;

public class AccountController {

	private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	private static List<Account> getAccountList(int id) {
		List<Account> list = new ArrayList<Account>();
		Session session = sessionFactory.openSession();
		Transaction t = null;

		try {
			t = session.beginTransaction();

			list = session.createQuery("from Account where id=" + id).list();
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
