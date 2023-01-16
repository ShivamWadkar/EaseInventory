package com.inventory.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.inventory.entity.User;
import com.inventory.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	private String addUser(@RequestBody User user) {
		
		// Adding current date
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
	    Date date = new Date();  
	    String strDate = formatter.format(date);
	    
	    // Setting creation date
	    user.setCreationDate(java.sql.Date.valueOf(strDate));
	    
		userService.saveUser(user);
		return "New User Added";
	}
	
	
}
