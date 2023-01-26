package com.inventory.easeinventory.services;

import com.inventory.easeinventory.dto.ProductDto;
import com.inventory.easeinventory.entity.Product;

public interface ProductService {

	public Product saveProduct(ProductDto productDto);
}
