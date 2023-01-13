package bsiopis.webapp.service;

import java.util.List;

import bsiopis.webapp.controller.UserInput;
import bsiopis.webapp.entity.*;

/**
 * 
 * The UserService service Interface. A service layer created in case the
 * application gets expanded and more database tables get added. It passes all
 * given methods into the UserDAO Interface Implementation.The explanation of
 * the class methods will be done in the Implementation class of the Interface.
 * 
 * @author Bill Siopis
 * @version 1.0
 * @since 2022-12-15
 *
 */
public interface UserService {

	/**
	 * The getUsers method of the User Service Implementation just calls on the
	 * getUsers method of the UserDAO Implementation class.
	 * 
	 * @return It returns the result of the UserDAO method it calls upon.
	 */
	public List<User> getUsers();

	/**
	 * The saveUser method of the User Service Implementation initially receives a
	 * UserInput class object as an input and passes the values through to a new
	 * User object which is able to be saved in the database. The reason this is
	 * done is for the Address object values to be passed inside the object
	 * accurately.
	 * 
	 * @param user is a UserInput object which holds the values given by a user
	 *             input.
	 * 
	 */
	public void saveUser(UserInput user);

	/**
	 * The getUser method of the User Service Implementation just calls on the
	 * getUser method of the UserDAO Implementation class.
	 * 
	 * @param Id is the id of the User object to be retrieved from the database.
	 * @return It returns the result of the UserDAO method it calls upon.
	 */
	public User getUser(int Id);

	/**
	 * The searchUsers method of the User Service Implementation just calls on the
	 * searchUsers method of the UserDAO Implementation class.
	 * 
	 * @param searchName The String that is being searched for in the database.
	 * @return It returns the result of the UserDAO method it calls upon.
	 */
	public List<User> searchUsers(String searchName);
}
