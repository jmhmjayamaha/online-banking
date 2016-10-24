package lk.harshana.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import lk.harshana.model.TransactionDetails;

public class TrancationController {
	
	private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	//save the transaction detalis
	private static void saveTransaction(TransactionDetails td) {
		Session session = sessionFactory.openSession();
		Transaction t = null;
		try {
			t = session.beginTransaction();
			
			session.save(td);
			
			t.commit();
		} catch(HibernateException e) {
			if(t !=null) {
				t.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	//list the transactions
	private static List<TransactionDetails> getTransactionDetails() {
		List<TransactionDetails> list = new ArrayList<TransactionDetails>();
		Session session = sessionFactory.openSession();
		Transaction t  = null;
		try {
			t = session.beginTransaction();
			
			list = session.createQuery("from TransactionDetails").list();
			t.commit();
		} catch(HibernateException e) {
			if(t != null) {
				t.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
