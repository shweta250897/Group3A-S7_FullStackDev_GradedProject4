package com.glearning.employeeManagement.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glearning.employeeManagement.dao.UserRegistrationDao;
import com.glearning.employeeManagement.service.UserService;

@RestController
@RequestMapping("/registration")
public class UserRegisrationController {
	private UserService userService;

	public void UserRegistrationController(UserService userService) {
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserRegistrationDao userRegistrationDao() {
        return new UserRegistrationDao();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDao registrationDao) {
		userService.save(registrationDao);
		return "redirect:/registration?success";
	}

}
