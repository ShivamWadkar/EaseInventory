package com.inventory.easeinventory.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "product_info_tbl")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;
	
	@Column(name = "product_name",columnDefinition = "VARCHAR(50)",nullable = false)
	private String name;
	
	@Column(name = "product_category",columnDefinition = "VARCHAR(50)",nullable = false)
	private String category;

	@Column(name = "previous_stock",columnDefinition = "INTEGER",nullable = false)
	private int previousStock;
	
	@Column(name = "changed_stock",columnDefinition = "INTEGER",nullable = false)
	private int changedStock;
	
	@Column(name = "new_stock",columnDefinition = "INTEGER",nullable = false)
	private int newStock;
	
	@Column(name = "product_type",columnDefinition = "VARCHAR(10)",nullable = false)
	private String type;
	
	@Column(name = "product_price",columnDefinition = "DECIMAL(12,4)",nullable = false)
	private Double price;
	
	@Column(name = "min_stock_level",columnDefinition = "INTEGER",nullable = false)
	private int minStockLevel;
	
	@Column(name = "max_stock_level",columnDefinition = "INTEGER",nullable = false)
	private int maxStockLevel;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id",referencedColumnName = "user_id")
	//@Column(name = "added_by")
	private User user;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	//@JoinColumn(name = "supplier_id",referencedColumnName = "supplier_id")
	@JoinTable(
			  name = "product_has_supplier", 
			  joinColumns = @JoinColumn(name = "product_id"), 
			  inverseJoinColumns = @JoinColumn(name = "supplier_id"))
	//@Column(name = "supplier")
	private Set<Supplier> supplier;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			  name = "product_has_buyer", 
			  joinColumns = @JoinColumn(name = "product_id"), 
			  inverseJoinColumns = @JoinColumn(name = "buyer_id"))
	private Set<Buyer> buyer;
	
	public Product() {
		
	}

	public Product(int id, String name, String category, int previousStock, int changedStock,
			int newStock, String type, Double price, int minStockLevel, int maxStockLevel,
			Date lastModifiedDate) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.previousStock = previousStock;
		this.changedStock = changedStock;
		this.newStock = newStock;
		this.type = type;
		this.price = price;
		this.minStockLevel = minStockLevel;
		this.maxStockLevel = maxStockLevel;
		this.lastModifiedDate = lastModifiedDate;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPreviousStock() {
		return previousStock;
	}

	public void setPreviousStock(int previousStock) {
		this.previousStock = previousStock;
	}

	public int getChangedStock() {
		return changedStock;
	}

	public void setChangedStock(int changedStock) {
		this.changedStock = changedStock;
	}

	public int getNewStock() {
		return newStock;
	}

	public void setNewStock(int newStock) {
		this.newStock = newStock;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getMinStockLevel() {
		return minStockLevel;
	}

	public void setMinStockLevel(int minStockLevel) {
		this.minStockLevel = minStockLevel;
	}

	public int getMaxStockLevel() {
		return maxStockLevel;
	}

	public void setMaxStockLevel(int maxStockLevel) {
		this.maxStockLevel = maxStockLevel;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Supplier> getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = new LinkedHashSet<Supplier>();
		this.supplier.add(supplier);
	}

	public Set<Buyer> getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = new LinkedHashSet<>();
		this.buyer.add(buyer);
	}
	
	
}
