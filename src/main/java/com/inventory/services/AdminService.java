package com.inventory.services;

import com.inventory.entity.Admin;

public interface AdminService {

	public Admin saveAdmin(Admin admin);
	
	public Admin getAdmin(String username, String password);
}
