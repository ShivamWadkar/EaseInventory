package com.inventory.easeinventory.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "admin_info_tbl")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="admin_id")
	private int id;
	
	@Column(name="admin_name",columnDefinition = "VARCHAR(100)",nullable = false)
	private String name;
	
	@Column(name="business_name",columnDefinition = "VARCHAR(100)",nullable = false)
	private String businessName;
	
	@Column(name="business_type",columnDefinition = "VARCHAR(100)",nullable = false)
	private String businessType;
	
	@Column(name="admin_role",columnDefinition = "VARCHAR(100)",nullable = false)
	private String role;
	
	@Column(name="email_id",columnDefinition = "VARCHAR(100)",nullable = false)
	private String emailId;
	
	@Column(name="contact_number",columnDefinition = "VARCHAR(20)",nullable = false)
	private String contactNumber;
	
	@Column(name = "password",columnDefinition = "VARCHAR(100)",nullable = false)
	private String password;
	
	public Admin() {
		
	}
	
	public Admin(int id, String name, String businessName, String businessType, String role, String emailId,
			String contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.businessName = businessName;
		this.businessType = businessType;
		this.role = role;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
