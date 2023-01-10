package bsiopis.webapp.dao;

import java.util.List;
import bsiopis.webapp.entity.User;

public interface UserDAO {

	public List<User> getUsers();

	public void saveUser(User user);

	public User getUser(int Id);


}
