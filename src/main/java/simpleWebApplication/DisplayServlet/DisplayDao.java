package simpleWebApplication.DisplayServlet;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import simpleWebApplication.HibernateConfig.HibernateConfig;
import simpleWebApplication.User.*;

public class DisplayDao {
	
	private SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
	
	public List<User> getUsers(){
		Transaction transaction = null;
		List<User> userlist = null;
		Session session = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			userlist = session.createQuery("from User", User.class).getResultList();
			System.out.println(userlist);
			transaction.commit();
		}
		catch(Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return userlist;
	}
}
