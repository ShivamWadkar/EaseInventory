package com.inventory.easeinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.easeinventory.entity.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

	public Buyer findByEmailId(String emailId);
}
