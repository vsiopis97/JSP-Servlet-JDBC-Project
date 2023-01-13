package bsiopis.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bsiopis.webapp.controller.UserInput;
import bsiopis.webapp.dao.UserDAO;
import bsiopis.webapp.entity.Address;
import bsiopis.webapp.entity.User;

/**
 * The User Service Interface Implementation. Its function is virtually the same
 * as the UserDAO Implementation as it has the same methods and it just works as
 * a pass through.
 * 
 * @author Bill Siopis
 * @version 1.0
 * @since 2022-12-15
 *
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * An initiation of a DAO object to pass the user input into.
	 */
	@Autowired
	private UserDAO userDAO;

	/**
	 * The getUsers method of the User Service Implementation just calls on the
	 * getUsers method of the UserDAO Implementation class.
	 * 
	 * @return It returns the result of the UserDAO method it calls upon.
	 */
	@Override
	@Transactional
	public List<User> getUsers() {

		return userDAO.getUsers();
	}

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
	@Override
	@Transactional
	public void saveUser(UserInput user) {
		User theUser = new User();
		theUser.setFirstName(user.getFirstName());
		theUser.setSurname(user.getSurname());
		theUser.setGender(user.getGender());
		theUser.setBirthdate(user.getBirthdate());

		Address theAddress = new Address(user.getWorkAddress(), user.getHomeAddress());
		theUser.setAddress(theAddress);

		userDAO.saveUser(theUser);
	}

	/**
	 * The getUser method of the User Service Implementation just calls on the
	 * getUser method of the UserDAO Implementation class.
	 * 
	 * @param Id is the id of the User object to be retrieved from the database.
	 * @return It returns the result of the UserDAO method it calls upon.
	 */
	@Override
	@Transactional
	public User getUser(int Id) {

		return userDAO.getUser(Id);
	}

	/**
	 * The searchUsers method of the User Service Implementation just calls on the
	 * searchUsers method of the UserDAO Implementation class.
	 * 
	 * @param searchName The String that is being searched for in the database.
	 * @return It returns the result of the UserDAO method it calls upon.
	 */
	@Override
	@Transactional
	public List<User> searchUsers(String searchName) {
		return userDAO.searchUsers(searchName);
	}

}
