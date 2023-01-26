package com.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.Supplier;
import com.inventory.services.SupplierService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	private SupplierService supplierService;
	
	@PostMapping("/add")
	public ResponseEntity<String> saveSupplier(@RequestBody Supplier supplier) {
		Supplier fetchedSupplier = supplierService.saveSupplier(supplier);
		if(fetchedSupplier != null)
			return ResponseEntity.ok("New Supplier Added");
		else
			return  ResponseEntity.ok("Supplier is already there");
	}
	
	@GetMapping("/getAll")
	public List<Supplier> getAllSuppliers(){
		
		return supplierService.getAllSuppliers();
	}
}
