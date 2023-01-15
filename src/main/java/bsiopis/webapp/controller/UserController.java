package bsiopis.webapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bsiopis.webapp.entity.*;
import bsiopis.webapp.service.UserService;

/**
 * 
 * User Controller. Self explanatory. The main class of the entire web
 * application. User Controller class contains the mapping to all the pages of
 * the web application which are used to control the user objects. Whenever an
 * HTTP Request is done on the web page it passes through this controller class.
 * 
 * @author Bill Siopis
 * @version 1.0
 * @since 2022-12-15
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController {

	/**
	 * Initiation of a User Service object to pass the user input into.
	 */
	@Autowired
	private UserService userService;

	/**
	 * initBinder method is responsible for clearing out all whitespace included in
	 * the user inputs.
	 * 
	 * @param dataBinder is used for data binding from web request parameters to
	 *                   JavaBean objects.
	 */
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	/**
	 * 
	 * listUser method is responsible for calling the Service method getUser() to
	 * create a list of the users stored in the database.
	 * 
	 * @param theModel is used as a container for data. The Model interface
	 *                 functions are used to pass data into the jsp the function is
	 *                 mapped to.
	 * @return Returns the list-users.jsp page address.
	 * 
	 */
	@GetMapping("/list")
	public String listUser(Model theModel) {

		List<User> users = userService.getUsers();

		theModel.addAttribute("users", users);

		return "list-users";
	}

	/**
	 * register method is responsible for creating the user object that the user
	 * input will be saved to and returning to the registration page for it to be
	 * saved.
	 * 
	 * @param theModel is used as a container for data. The Model interface
	 *                 functions are used to pass data into the jsp the function is
	 *                 mapped to.
	 * @return Returns the register.jsp page address.
	 */
	@GetMapping("/register")
	public String register(Model theModel) {

		User user = new User();
		theModel.addAttribute("user", user);

		return "register";
	}

	/**
	 * Method saveUser is used for validation of the user input via @Valid
	 * annotation and for passing the user input into the saveUser method of the
	 * Service layer. The user input is annotated by @ModelAttribute in order to
	 * have the values inputed in the webpage.
	 * 
	 * @param user          The user input stored in a UserInput temp object in
	 *                      order to pass all the values correctly.
	 * @param bindingResult is the variable that holds any possible errors in the
	 *                      validation in order be checked with an if function.
	 * @return Returns the address to the success.jsp if there are no errors in the
	 *         submitted data.
	 */
	@PostMapping("/saveUser")
	public String saveUser(@Valid @ModelAttribute("user") UserInput user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "register";
		} else {
			userService.saveUser(user);

			return "success";
		}
	}

	/**
	 * 
	 * userDetails method is used to call the method getUser() from the Service
	 * layer with an input of a userId to find a specific record.
	 * 
	 * @param Id       A value of a user ID is obtained via a @RequestParam
	 *                 annotation and passed in the method in order to search for a
	 *                 record with that id number.
	 * @param theModel is used as a container for data. The Model interface
	 *                 functions are used to pass data into the jsp the function is
	 *                 mapped to.
	 * @return Returns the user-details.jsp page address.
	 */
	@GetMapping("/details")
	public String userDetails(@RequestParam("userId") int Id, Model theModel) {

		User user = userService.getUser(Id);

		theModel.addAttribute("user", user);

		return "user-details";
	}

	/**
	 * 
	 * searchUsers method is used to call the searchUsers method of the Service
	 * Layer passing through a searchName variable given by user input.
	 * 
	 * @param searchName is the variable gained by user input via the @RequestParam
	 *                   annotation. It is used to determine which users are to be
	 *                   searched for.
	 * @param theModel   is used as a container for data. The Model interface
	 *                   functions are used to pass data into the jsp the function
	 *                   is mapped to.
	 * @return Returns the list-users.jsp page address.
	 */
	@GetMapping("/search")
	public String searchUsers(@RequestParam(value = "searchName", defaultValue = "") String searchName,
			Model theModel) {

		List<User> users = userService.searchUsers(searchName);

		theModel.addAttribute("users", users);
		return "list-users";
	}

}
