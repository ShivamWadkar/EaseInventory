package com.inventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Supplier;
import com.inventory.repository.SellerRepository;

@Service
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	private SellerRepository sellerRepository;
	
	@Override
	public Supplier saveSeller(Supplier supplier) {
		return sellerRepository.save(supplier);
	}

}
