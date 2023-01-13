package bsiopis.webapp.dao;

import java.util.List;
import bsiopis.webapp.entity.User;

/**
 * 
 * The UserDAO Interface The Interface that provides abstraction to the
 * Data Access Object. The explanation of the class methods will be done in the
 * Implementation class of the Interface.
 * 
 * @author Bill Siopis
 * @version 1.0
 * @since 2022-12-15
 *
 */
public interface UserDAO {

	/**
	 * getUsers() method that accesses the MySQL database and returns the entirety
	 * of the database's entries as a list of objects. The connection to the
	 * database is done via Hibernate and Query.
	 * 
	 * @return Returns the result of the selection query.
	 */
	public List<User> getUsers();

	/**
	 * The method that saves a user entry in the database.
	 * @param user the User object to be saved in the database
	 */
	public void saveUser(User user);

	/**
	 * The method that accesses the MySQL database and returns an entire list of the
	 * database's entries. The connection to the database is done via Hibernate and
	 * Query.
	 * 
	 * @param Id is the id value of the database entry that is being searchede.
	 * @return Returns the User object with the chosen id value.
	 */
	public User getUser(int Id);

	/**
	 * The searchUsers method accesses the MySQL database with a given String and
	 * searches for all the entries that contain the given String in the firstName
	 * or surname column. If the given String is null, it returns the entirety of
	 * the database's entries as a list of objects. The search is not case sensitive
	 * and ignores any given whitespace. The connection to the database is done via
	 * Hibernate and Query.
	 * 
	 * @param searchName is the String that is being searched for in the database entries.
	 * @return The method returns a list of user objects which contains either the
	 *         users that have the given String in their firstName or surname column
	 *         or all the users of the database in case of a null string.
	 */
	public List<User> searchUsers(String searchName);

}
