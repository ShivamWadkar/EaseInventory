package com.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.Buyer;
import com.inventory.services.BuyerService;

@RestController
@RequestMapping("/buyer")
@CrossOrigin("http://localhost:3000/")
public class BuyerController {

	@Autowired
	private BuyerService buyerService;
	
	@PostMapping("/add")
	public ResponseEntity<String> saveBuyer(@RequestBody Buyer buyer){
		
		System.out.println(buyer.getUser());
		
		Buyer fetchedBuyer = buyerService.saveBuyer(buyer);
		if(fetchedBuyer != null) 
			return ResponseEntity.ok("New Buyer Added");
		else
			return ResponseEntity.ok("Buyer already there");
	}
	
	@GetMapping("/getAll")
	public List<Buyer> getAllBuyers(){
		
		return buyerService.getAllBuyers();
	}
}
