package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	public Admin findByEmailId(String email);
}
