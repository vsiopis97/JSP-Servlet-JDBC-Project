package bsiopis.webapp.service;

import java.util.List;

import bsiopis.webapp.controller.UserInput;
import bsiopis.webapp.entity.*;

public interface UserService {

	public List<User> getUsers();

	public void saveUser(UserInput user);

	public User getUser(int Id);
}
