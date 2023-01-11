package bsiopis.webapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String saveUser(@Valid @ModelAttribute("user") UserInput user, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "register";
		}
		else {
			userService.saveUser(user);
			
			return "success";
		}    
	}
	
	@GetMapping("/details")
	public String userDetails(@RequestParam("userId") int Id, Model theModel) {

		User user = userService.getUser(Id);
		
		theModel.addAttribute("user", user);
		
		return "user-details";
	}
	
	@GetMapping("/search")
    public String searchUsers(@RequestParam("searchName") String searchName,
                                    Model theModel) {
        // search customers from the service
        List<User> users = userService.searchUsers(searchName);
                
        // add the customers to the model
        theModel.addAttribute("users", users);
        return "list-users";        
    }

}
