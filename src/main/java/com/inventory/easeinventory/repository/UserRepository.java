package com.inventory.easeinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.easeinventory.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByEmailId(String emailId);
}
