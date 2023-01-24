package com.inventory.services;

import java.util.List;

import com.inventory.entity.Supplier;

public interface SupplierService {

	public Supplier saveSupplier(Supplier supplier);
	
	public List<Supplier> getAllSuppliers();
}
