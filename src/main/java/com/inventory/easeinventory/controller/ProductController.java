package com.inventory.easeinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.easeinventory.dto.ProductDto;
import com.inventory.easeinventory.entity.Product;
import com.inventory.easeinventory.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/add")
	public String addProduct(@RequestBody ProductDto productDto) {
		
		Product fetchedProduct = productService.saveProduct(productDto);
		if(fetchedProduct != null)
			return "New Product Added";
		else
			return "Something wrong happen";
	}
}
