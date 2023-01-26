package com.inventory.easeinventory.dto;

public class ProductDto {

	private String name;
	private String category;
	private String type;
	private Double price;
	private int changedStock;
	private int minStockLevel;
	private int maxStockLevel;
	private String userEmailId;
	private int supplierId;
	private int buyerId;
	
	public ProductDto() {
		
	}

	public ProductDto(String name, String category, String type, Double price, int changedStock, int minStockLevel,
			int maxStockLevel, String userEmailId, int supplierId, int buyerId) {
		super();
		this.name = name;
		this.category = category;
		this.type = type;
		this.price = price;
		this.changedStock = changedStock;
		this.minStockLevel = minStockLevel;
		this.maxStockLevel = maxStockLevel;
		this.userEmailId = userEmailId;
		this.supplierId = supplierId;
		this.buyerId = buyerId;
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

	public int getChangedStock() {
		return changedStock;
	}

	public void setChangedStock(int changedStock) {
		this.changedStock = changedStock;
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

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	@Override
	public String toString() {
		return "ProductDto [name=" + name + ", category=" + category + ", type=" + type + ", price=" + price
				+ ", changedStock=" + changedStock + ", minStockLevel=" + minStockLevel + ", maxStockLevel="
				+ maxStockLevel + ", userEmailId=" + userEmailId + ", supplierId=" + supplierId + ", buyerId=" + buyerId
				+ "]";
	}

}
