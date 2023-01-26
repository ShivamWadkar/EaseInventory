package com.inventory.easeinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.inventory.easeinventory.entity.User;
import com.inventory.easeinventory.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<User> addTeamMember(@RequestBody User user){
					
			//Inserting user
			User fetchedUser = userService.saveUser(user);
			return ResponseEntity.ok(fetchedUser);
	}
	
	
}
