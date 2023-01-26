package com.inventory.easeinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.easeinventory.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

	public Supplier findByEmailId(String emailId);
}
