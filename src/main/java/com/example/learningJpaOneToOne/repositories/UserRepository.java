package com.example.learningJpaOneToOne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learningJpaOneToOne.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
