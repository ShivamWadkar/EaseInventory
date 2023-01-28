package com.inventory.easeinventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.inventory.easeinventory.entity.Admin;
import com.inventory.easeinventory.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public Admin saveAdmin(Admin admin) {

		String encodedPassword = (passwordEncoder.encode(admin.getPassword()));
		admin.setPassword(encodedPassword);
		return adminRepository.save(admin);
	}

	@Override
	public Admin getAdmin(String email, String password) {
		
		Admin fetchedAdmin = adminRepository.findByEmailId(email);
		
		return fetchedAdmin;
		
	}

	
}
