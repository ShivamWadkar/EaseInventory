package com.inventory.easeinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventory.easeinventory.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	public Product findByName(String name);
}
