package com.inventory.easeinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.easeinventory.entity.Admin;
import com.inventory.easeinventory.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/register")
	public String signup(@RequestBody Admin admin) {
		
		adminService.saveAdmin(admin);
		return "New Admin Added";
	}
	
}
