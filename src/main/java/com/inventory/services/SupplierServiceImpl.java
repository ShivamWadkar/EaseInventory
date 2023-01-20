package com.inventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Supplier;
import com.inventory.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService{

	@Autowired
	private SupplierRepository supplierRepository;
	
	@Override
	public Supplier saveSupplier(Supplier supplier) {
		
		Supplier fetchedSupplier = supplierRepository.findByEmailId(supplier.getEmailId());
		if(fetchedSupplier == null) {
			return supplierRepository.save(supplier);
		}
		else
			return null;
		
	}

}
