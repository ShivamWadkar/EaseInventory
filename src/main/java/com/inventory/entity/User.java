package com.inventory.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_info_tbl")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "user_name",columnDefinition = "VARCHAR(100)",nullable = false)
	private String name;
	
	@Column(name = "email_id",columnDefinition = "VARCHAR(100)",nullable = false,unique = true)
	private String emailId;
	
	@Column(name = "contact_number",columnDefinition = "VARCHAR(20)",nullable = false)
	private String contactNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id",referencedColumnName = "department_id")
	private Department department;
	
	@Column(name = "role",columnDefinition = "VARCHAR(50)",nullable = false)
	private String role;
	
	@Column(name = "creation_date",columnDefinition = "DATE")
	private java.sql.Date creationDate;
	
	@Column(name= "password",columnDefinition = "VARCHAR(100)",nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "user")
	private Set<Supplier> supplier;
	
	@OneToMany(mappedBy = "user")
	private Set<Buyer> buyer;
	
	@OneToMany(mappedBy = "user")
	private Set<Product> product;
	
	public User() {
		
	}

	public User(int id, String name, String emailId, String contactNumber, Department department, String role,
			Date creationDate, String password) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.department = department;
		this.role = role;
		this.creationDate = creationDate;
		this.password = password;
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

	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public java.sql.Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(java.sql.Date creationDate) {
		System.out.println(creationDate);
		this.creationDate = creationDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ", contactNumber=" + contactNumber
				+ ", department=" + department + ", role=" + role + ", creationDate=" + creationDate + ", password="
				+ password + ", supplier=" + supplier + ", product=" + product + "]";
	}

	

	
	
	
}
