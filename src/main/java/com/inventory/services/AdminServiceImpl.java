package com.inventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Admin;
import com.inventory.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public Admin saveAdmin(Admin admin) {
		
		return adminRepository.save(admin);
	}

	@Override
	public Admin getAdmin(String email, String password) {
		
		Admin fetchedAdmin = adminRepository.findByEmailId(email);
		
		return fetchedAdmin;
		
	}

	
}
