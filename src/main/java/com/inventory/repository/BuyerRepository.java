package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

	public Buyer findByEmailId(String emailId);
}
