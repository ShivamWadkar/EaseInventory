package com.inventory.easeinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.easeinventory.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	public Admin findByEmailId(String email);
}
