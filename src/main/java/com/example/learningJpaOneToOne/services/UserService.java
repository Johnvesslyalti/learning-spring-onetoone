package com.example.learningJpaOneToOne.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learningJpaOneToOne.entities.User;
import com.example.learningJpaOneToOne.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public ArrayList<User> getAllUsers() {
		return (ArrayList<User>) userRepository.findAll();
	}
	public Optional<User> getUserById(int id) {
		return userRepository.findById(id);
	}

}
