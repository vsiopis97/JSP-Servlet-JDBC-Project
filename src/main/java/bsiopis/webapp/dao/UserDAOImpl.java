package bsiopis.webapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bsiopis.webapp.entity.User;

/**
 * 
 * The UserDAO Interface Implementation This class is the one that runs all the
 * vital methods of the entire web application. It has the @Repository Spring
 * annotation, which is used to indicate that the class provides the mechanism
 * for storage, retrieval and search operation.
 * 
 * @author Bill Siopis
 * @version 1.0
 * @since 2022-12-15
 *
 */
@Repository
public class UserDAOImpl implements UserDAO {

	/**
	 * The Session Factory of Hibernate
	 */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * getUsers() method that accesses the MySQL database and returns the entirety
	 * of the database's entries as a list of objects. The connection to the
	 * database is done via Hibernate and Query.
	 * 
	 * @return Returns the result of the selection query.
	 */
	@Override
	public List<User> getUsers() {

		Session session = sessionFactory.getCurrentSession();
		Query<User> query = session.createQuery("from User", User.class);
		return query.getResultList();
	}

	/**
	 * The method that saves a user entry in the database.
	 * 
	 * @param user the User object to be saved in the database
	 */
	@Override
	public void saveUser(User user) {

		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	/**
	 * The method that accesses the MySQL database and returns an entire list of the
	 * database's entries. The connection to the database is done via Hibernate and
	 * Query.
	 * 
	 * @param Id is the id value of the database entry that is being searched.
	 * @return Returns the User object with the chosen id value.
	 */
	@Override
	public User getUser(int Id) {
		Session session = sessionFactory.getCurrentSession();

		User user = session.get(User.class, Id);

		return user;
	}

	/**
	 * The searchUsers method accesses the MySQL database with a given String and
	 * searches for all the entries that contain the given String in the firstName
	 * or surname column. If the given String is null, it returns the entirety of
	 * the database's entries as a list of objects. The search is not case sensitive
	 * and ignores any given whitespace. The connection to the database is done via
	 * Hibernate and Query.
	 * 
	 * @param searchName is the String that is being searched for in the database
	 *                   entries.
	 * @return The method returns a list of user objects which contains either the
	 *         users that have the given String in their firstName or surname column
	 *         or all the users of the database in case of a null string.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<User> searchUsers(String searchName) {
		Session currentSession = sessionFactory.getCurrentSession();

		Query theQuery = null;

		if (searchName != null && searchName.trim().length() > 0) {
			theQuery = currentSession.createQuery(
					"from User where lower(firstName) like :name or lower(surname) like :name", User.class);
			theQuery.setParameter("name", "%" + searchName.toLowerCase() + "%");
		} else {
			theQuery = currentSession.createQuery("from User", User.class);
		}

		List<User> users = theQuery.getResultList();

		return users;

	}

}
