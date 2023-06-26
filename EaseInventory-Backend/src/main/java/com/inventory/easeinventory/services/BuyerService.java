package com.inventory.easeinventory.services;

import java.util.List;

import com.inventory.easeinventory.entity.Buyer;

public interface BuyerService {

	public Buyer saveBuyer(Buyer buyer);
	
	public List<Buyer> getAllBuyers();
	
	public Buyer getBuyer(int id);
}
