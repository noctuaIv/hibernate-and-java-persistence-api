package com.infiniteskills.data;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infiniteskills.data.entities.Credential;
import com.infiniteskills.data.entities.User;

public class Application {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			Transaction transaction = session.beginTransaction();
			
			User user = new User();
			user.setFirstName("Kevin");
			user.setLastName("Bowersox");
			user.setAge(20);
			user.setBirthDate(new Date());
			user.setCreatedBy("Kevin Bowersox");
			user.setCreatedDate(new Date());
			user.setEmailAddress("kevin.bowersox@navy.mil");
			user.setLastUpdatedDate(new Date());
			user.setLastUpdatedBy("Kevin Bowersox");

			Credential credential = new Credential();
			credential.setPassword("kevinspassword");
			credential.setUsername("kmb385");
			
			credential.setUser(user);
			user.setCredential(credential);
			
			session.save(credential);
			transaction.commit();
			
			User dbUser = (User) session.get(User.class, credential.getUser().getUserId());
			System.out.println(dbUser.getFirstName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
			HibernateUtil.getSessionFactory().close();
		}
	}

	
}
