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

	@Override
	public User getUser(int Id) {
		Session session = sessionFactory.getCurrentSession();
		
		User user = session.get(User.class, Id);
		
		return user;
	}

	@Override
	public List<User> searchUsers(String searchName) {
        Session currentSession = sessionFactory.getCurrentSession();
        
        Query theQuery = null;
        
        if (searchName != null && searchName.trim().length() > 0) {
            theQuery =currentSession.createQuery("from User where lower(firstName) like :name or lower(surname) like :name", User.class);
            theQuery.setParameter("name", "%" + searchName.toLowerCase() + "%");
        }
        else {
            theQuery =currentSession.createQuery("from User", User.class);            
        }
        
        // execute query and get result list
        List<User> users = theQuery.getResultList();
                
        // return the results        
        return users;
        
    }

}
