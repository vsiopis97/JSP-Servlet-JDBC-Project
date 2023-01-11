package bsiopis.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bsiopis.webapp.entity.*;
import bsiopis.webapp.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/list")
	public String listUser(Model theModel) {

		List<User> users = userService.getUsers();

		theModel.addAttribute("users", users);

		return "list-users";
	}
	
	@GetMapping("/register")
	public String register(Model theModel){
		
		User user = new User();
		theModel.addAttribute("user",user);
		
		return "register";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") UserInput user){
		
	    userService.saveUser(user);
		
		return "redirect:/user/register";
	}
	
	@GetMapping("/details")
	public String userDetails(@RequestParam("userId") int Id, Model theModel) {

		User user = userService.getUser(Id);
		
		theModel.addAttribute("user", user);
		
		return "user-details";
	}

}
