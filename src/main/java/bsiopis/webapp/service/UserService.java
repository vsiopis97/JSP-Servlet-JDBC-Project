package bsiopis.webapp.service;

import java.util.List;

import bsiopis.webapp.controller.UserDTO;
import bsiopis.webapp.entity.*;

public interface UserService {

	public List<User> getUsers();

	public void saveUser(UserDTO user);

	public User getUser(int Id);
}
