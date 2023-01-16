package com.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.entity.Supplier;

public interface SellerRepository extends JpaRepository<Supplier, Integer>{

}
