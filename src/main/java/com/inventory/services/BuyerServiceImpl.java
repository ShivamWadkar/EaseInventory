package com.inventory.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Buyer;
import com.inventory.repository.BuyerRepository;
import com.inventory.repository.UserRepository;

@Service
public class BuyerServiceImpl implements BuyerService{

	@Autowired
	private BuyerRepository buyerRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Buyer saveBuyer(Buyer buyer) {
		
		buyer.setUser(userRepository.findByEmailId(buyer.getUser().getEmailId()));
		Buyer fetchedBuyer = buyerRepository.findByEmailId(buyer.getEmailId());
		if(fetchedBuyer == null) {
			return buyerRepository.save(buyer);
		}
		return null;
	}

	@Override
	public List<Buyer> getAllBuyers() {
		
		return buyerRepository.findAll();
	}

	@Override
	public Buyer getBuyer(int id) {
		return buyerRepository.findById(id).get();
	}

}
