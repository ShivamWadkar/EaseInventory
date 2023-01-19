package com.inventory.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "supplier_info_tbl")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplier_id")
	private int id;
	
	@Column(name = "supplier_name",columnDefinition = "VARCHAR(50)",nullable = false)
	private String name;
	
	@Column(name = "supplier_add",columnDefinition = "VARCHAR(100)",nullable = false)
	private String supplierAdd;
	
	@Column(name = "email_id",columnDefinition = "VARCHAR(50)",nullable = false,unique = true)
	private String emailId;
	
	@Column(name = "contact_number",columnDefinition = "VARCHAR(15)",nullable = false)
	private String contactNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id",referencedColumnName = "user_id")
	private User user;
	
	@ManyToMany(mappedBy = "supplier")
	private Set<Product> product;
	
	public Supplier() {
		
	}

	public Supplier(int id, String name, String sellerAdd, String emailId, String contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.supplierAdd = sellerAdd;
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

	public String getSupplierAdd() {
		return supplierAdd;
	}

	public void setSupplierAdd(String supplierAdd) {
		this.supplierAdd = supplierAdd;
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
	
	
}
