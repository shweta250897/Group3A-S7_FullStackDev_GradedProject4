package com.glearning.employeeManagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.glearning.employeeManagement.dao.UserRegistrationDao;
import com.glearning.employeeManagement.entity.User;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDao registrationDao);

}
