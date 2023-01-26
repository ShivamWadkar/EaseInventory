package com.inventory.easeinventory.services;

import com.inventory.easeinventory.entity.Admin;

public interface AdminService {

	public Admin saveAdmin(Admin admin);
	
	public Admin getAdmin(String username, String password);
}
