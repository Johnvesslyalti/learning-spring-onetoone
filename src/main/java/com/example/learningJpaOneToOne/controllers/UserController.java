package com.example.learningJpaOneToOne.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learningJpaOneToOne.entities.User;
import com.example.learningJpaOneToOne.services.UserService;

@RestController
@RequestMapping("/users/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("all")
	public ArrayList<User> getAllUsers() {
		return userService.getAllUsers();
	}
	@GetMapping("{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
}
