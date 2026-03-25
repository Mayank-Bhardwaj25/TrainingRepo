package com.coforge.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.User;
import com.coforge.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);	
	
	@Autowired
	UserService userservice;
	@GetMapping("/")
	public List<User> getAllUser() {
		logger.info("Fetching all the users");
		return userservice.getAllUsers();
	}
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		logger.info("Saving the current User");
		return userservice.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public User findUserById(@PathVariable("id") long id) {
		logger.info("Getting this id user");
		return userservice.FindById(id);
	}
}
