package bsiopis.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bsiopis.webapp.controller.UserDTO;
import bsiopis.webapp.dao.UserDAO;
import bsiopis.webapp.entity.Address;
import bsiopis.webapp.entity.User;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		
		return userDAO.getUsers();
	}

	@Override
	@Transactional
	public void saveUser(UserDTO user) {
		User theUser = new User();
		theUser.setFirstName(user.getFirstName());
		theUser.setSurname(user.getSurname());
		theUser.setGender(user.getGender());
		theUser.setBirthdate(user.getBirthdate());
		
		Address theAddress = new Address(user.getWorkAddress(),user.getHomeAddress());
		theUser.setAddress(theAddress);
		
		userDAO.saveUser(theUser);
	}

}
