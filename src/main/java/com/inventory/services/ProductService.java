package com.inventory.services;

import com.inventory.dto.ProductDto;
import com.inventory.entity.Product;

public interface ProductService {

	public Product saveProduct(ProductDto productDto);
}
