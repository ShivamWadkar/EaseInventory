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
@Table(name = "buyer_info_tbl")
public class Buyer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "buyer_id")
	private int id;
	
	@Column(name = "buyer_name",columnDefinition = "VARCHAR(50)",nullable = false)
	private String name;
	
	@Column(name = "buyer_add",columnDefinition = "VARCHAR(100)",nullable = false)
	private String buyerAdd;
	
	@Column(name = "email_id",columnDefinition = "VARCHAR(50)",nullable = false,unique = true)
	private String emailId;
	
	@Column(name = "contact_number",columnDefinition = "VARCHAR(15)",nullable = false)
	private String contactNumber;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id",referencedColumnName = "user_id")
	private User user;
	
	@ManyToMany(mappedBy = "buyer")
	private Set<Product> product;
	
	public Buyer() {
		
	}

	public Buyer(int id, String name, String buyerAdd, String emailId, String contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.buyerAdd = buyerAdd;
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

	public String getBuyerAdd() {
		return buyerAdd;
	}

	public void setBuyerAdd(String buyerAdd) {
		this.buyerAdd = buyerAdd;
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
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Buyer [id=" + id + ", name=" + name + ", buyerAdd=" + buyerAdd + ", emailId=" + emailId
				+ ", contactNumber=" + contactNumber;
	}
	
	
	
}
