package com.infiniteskills.data.entities;

import java.util.Date;

import org.hibernate.Session;

import com.infiniteskills.data.HibernateUtil;

public class Application {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		User user = new User();
		user.setBirthDate(new Date());
		user.setCreatedBy("ivan");
		user.setCreatedDate(new Date());
		user.setEmailAddress("kmb@ukr.net");
		user.setFirstName("Ivan");
		user.setLastName("Voytovych");
		user.setLastUpdatedBy("ivan");
		user.setLastUpdatedDate(new Date());
		
		session.save(user);
		session.getTransaction().commit();
		
		session.getTransaction().begin();
		User dbUser = (User) session.get(User.class, user.getUserId());
		dbUser.setFirstName("Joe");
		session.update(dbUser);
		session.getTransaction().commit();
		session.close();
	}
}
