package com.inventory.services;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Department;
import com.inventory.entity.User;
import com.inventory.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private DepartmentService departmentService;
	
	@Override
	public String saveUser(User user) {
		
		// Check whether user with same emailId already exists
		User fetchedUser = userRepository.findByEmailId(user.getEmailId());
		if(fetchedUser == null) {
			// Adding current date
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
			Date date = new Date();  
			String strDate = formatter.format(date);
						    
			// Setting creation date
			user.setCreationDate(java.sql.Date.valueOf(strDate));
			
			// Check/Insert department in database before inserting user due to foreign key constraint 
			Department department = departmentService.saveDepartment(user.getDepartment());
			
			// Setting department
			user.setDepartment(department);
			userRepository.save(user);
			return "New user added successfully";
		}
		else
			return "User with given email id already present";
	}

	
}
