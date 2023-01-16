package com.inventory.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@PostMapping("/login")
	public ResponseEntity<Object> login(@RequestBody Map<String, String>body) {
		
		String email = body.get("email");
		String password = body.get("password");
		
		Admin admin = adminService.getAdmin(email, password);
		
		String token = "LoggedIn"; //Generate Token here
		Map<String,Object> responseBody = new HashMap<>();
		if(admin != null) {
			responseBody.put("token",token);
			responseBody.put("data", admin);
			
			return new ResponseEntity<>(responseBody, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
		}
	}
}
