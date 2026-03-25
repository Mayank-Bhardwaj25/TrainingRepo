package com.coforge.controller;

import java.util.List;

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

	@Autowired
	UserService userservice;
	@GetMapping("/")
	public List<User> getAllUser() {
		
		return userservice.getAllUsers();
	}
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userservice.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public User findUserById(@PathVariable("id") long id) {
		return userservice.FindById(id);
	}
}
