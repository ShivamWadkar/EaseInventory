package com.inventory.easeinventory.services;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.inventory.easeinventory.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.inventory.easeinventory.entity.Department;

import com.inventory.easeinventory.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User saveUser(User user) {
		// Check whether user with same emailId already exists
		User fetchedUser = userRepository.findByEmailId(user.getEmailId());

		if(fetchedUser == null) {

			// Setting encoded password
			String encodedPassword = passwordEncoder.encode(user.getPassword());
			user.setPassword(encodedPassword);

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
			return userRepository.save(user);
		}
		else
			return null;
	}
}
