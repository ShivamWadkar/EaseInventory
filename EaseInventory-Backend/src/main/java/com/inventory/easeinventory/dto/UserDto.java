package com.inventory.easeinventory.dto;

import java.sql.Date;

public class UserDto {

	private int userId;
	private String name;
	private String emailId;
	private String contactNumber;
	private String departmentName;
	private String role;
	private Date creationDate;
	
	public UserDto() {
		
	}

	public UserDto(int userId, String name, String emailId, String contactNumber, String departmentName, String role,
			Date crationDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.departmentName = departmentName;
		this.role = role;
		this.creationDate = crationDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	
	
	
	
}
