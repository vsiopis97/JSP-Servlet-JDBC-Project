package bsiopis.webapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bsiopis.webapp.entity.User;
import bsiopis.webapp.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getUsers() {

		return userService.getUsers();

	}

	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable int userId) {

		User user = userService.getUser(userId);

		if (user == null) {
			throw new UserNotFoundException("User id not found - " + userId);
		}

		return user;

	}

	
}
