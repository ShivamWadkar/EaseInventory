package com.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.Admin;
import com.inventory.services.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000/")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/signup")
	public String signup(@RequestBody Admin admin) {
		
		adminService.saveAdmin(admin);
		return "New Admin Added";
	}
	
}
