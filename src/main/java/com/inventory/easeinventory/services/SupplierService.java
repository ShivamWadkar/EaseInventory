package com.inventory.easeinventory.services;

import java.util.List;

import com.inventory.easeinventory.entity.Supplier;

public interface SupplierService {

	public Supplier saveSupplier(Supplier supplier);
	
	public List<Supplier> getAllSuppliers();
	
	public Supplier getSupplier(int id);
}
