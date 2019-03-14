package com.infiniteskills.data;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.infiniteskills.data.entities.Account;

public class HqlApplication {

	@SuppressWarnings({"unchecked" })
	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		org.hibernate.Transaction tx = null;

		try {
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
			
			Query query = session.createQuery("select distinct t.account from Transaction t"
					+ " where t.amount > 500 and lower(t.transactionType) = 'deposit'");
			
			List<Account> accounts = query.list();
			
			for(Account a:accounts){
				System.out.println(a.getName());
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
