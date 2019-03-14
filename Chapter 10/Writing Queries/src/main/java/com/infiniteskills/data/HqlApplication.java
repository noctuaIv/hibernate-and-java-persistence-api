package com.infiniteskills.data;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.infiniteskills.data.entities.Transaction;

public class HqlApplication {

	public static void main(String[] args) {
		
		SessionFactory factory = null;
		Session session = null;
		org.hibernate.Transaction tx = null;
		
		try{
			factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			tx = session.beginTransaction();
			
			Query query = session.createQuery("select t from Transaction t");
			List<Transaction> transactions = query.list();
			
			for(Transaction t:transactions){
				System.out.println(t.getTitle());
			}
			
			tx.commit();
		}catch(Exception e){
			tx.rollback();
		}finally{
			session.close();
			factory.close();
		}
	}
}

