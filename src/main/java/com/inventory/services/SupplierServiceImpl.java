package com.inventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Supplier;
import com.inventory.repository.SupplierRepository;
import com.inventory.repository.UserRepository;

@Service
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	private SupplierRepository supplierRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Supplier saveSupplier(Supplier supplier) {
		
		supplier.setUser(userRepository.findByEmailId(supplier.getUser().getEmailId()));
		Supplier fetchedSupplier = supplierRepository.findByEmailId(supplier.getEmailId());
		if(fetchedSupplier == null) {
			return supplierRepository.save(supplier);
		}
		else
			return null;
		
	}

}
