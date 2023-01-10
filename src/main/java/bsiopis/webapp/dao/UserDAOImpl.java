package bsiopis.webapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bsiopis.webapp.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<User> getUsers() {

		Session session = sessionFactory.getCurrentSession();
		Query<User> query = session.createQuery("from User", User.class);
		return query.getResultList();
	}

	@Override
	public void saveUser(User user) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

}
