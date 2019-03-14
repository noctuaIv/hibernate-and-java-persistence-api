package com.infiniteskills.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import com.infiniteskills.data.entities.Transaction;

public class HibernateApplication {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		org.hibernate.Transaction tx = null;

		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();

			List<Transaction> transactions = session
					.createCriteria(Transaction.class)
					.addOrder(Order.desc("title")).list();

			for (Transaction t : transactions) {
				System.out.println(t.getTitle());
			}

			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
			factory.close();
		}
	}
}
