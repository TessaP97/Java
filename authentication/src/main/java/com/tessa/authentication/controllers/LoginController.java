package com.tessa.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tessa.authentication.models.User;
import com.tessa.authentication.services.UserService;
import com.tessa.authentication.validators.UserValidator;

//imports removed for brevity
@Controller
public class LoginController {

	@Autowired
	private UserValidator validator;

	
private final UserService userService;
 
 public LoginController(UserService userService) {
     this.userService = userService;
 }
 
 @RequestMapping("/registration")
 public String registerForm(@ModelAttribute("user") User user) {
     return "registrationPage.jsp";
 }
 @RequestMapping("/login")
 public String login() {
     return "loginPage.jsp";
 }
 
 @RequestMapping(value="/registration", method=RequestMethod.POST)
 public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
     // if result has errors, return the registration page (don't worry about validations just now)
     // else, save the user in the database, save the user id in session, and redirect them to the /home route
	 // Validate
	 validator.validate(user, result);
	 if (result.hasErrors()) {
		 return "registrationPage.jsp";
	 }
	 User newUser = userService.registerUser(user);
	 // putting in session only the user Id
	 session.setAttribute("user_id", newUser.getId());
	 return "redirect:/home";
 }
 
 @RequestMapping(value="/login", method=RequestMethod.POST)
 public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, RedirectAttributes flash) {
     // if the user is authenticated, save their user id in session
     // else, add error messages and return the login page
	 // checking credentials using a boolean from function authenticate user
	 // then takes the users email to store user id in session 
	  if (userService.authenticateUser(email, password)) {
		  User thisUser = userService.findByEmail(email);
		  session.setAttribute("user_id", thisUser.getId());
		  return "redirect:/home";
	  } else {
		  flash.addFlashAttribute("error", "login fail");
		  return "redirect:/login";
	  }
 }
 
 @RequestMapping("/home")
 public String home(HttpSession session, Model model) {
     // get user from session, save them in the model and return the home page
	 Long id = (Long) session.getAttribute("user_id");
	 if (id != null) {
		 User thisUser = userService.findUserById(id);
		 model.addAttribute("user", thisUser);
		 return "homePage.jsp";
	 }
	 return "redirect:/login";
 }
 
 @RequestMapping("/logout")
 public String logout(HttpSession session) {
     // invalidate session
	 session.invalidate();
     // redirect to login page
	 return "redirect:/login";
 }
}