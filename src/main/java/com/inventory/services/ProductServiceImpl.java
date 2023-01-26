package com.inventory.services;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.dto.ProductDto;
import com.inventory.entity.Product;
import com.inventory.repository.ProductRepository;
import com.inventory.repository.UserRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SupplierService supplierService;
	
	@Autowired
	private BuyerService buyerService;
	
	@Override
	public Product saveProduct(ProductDto productDto) {
		
		System.out.println(productDto.getPrice());
		
		Product product = new Product();
		product.setName(productDto.getName());
		product.setCategory(productDto.getCategory());
		product.setType(productDto.getType());
		product.setPrice(productDto.getPrice());
		product.setChangedStock(productDto.getChangedStock());
		product.setPreviousStock(0);
		product.setNewStock(productDto.getChangedStock());
		
		// Setting Modified date
		
		// Adding current date
					SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
					Date date = new Date();  
					String strDate = formatter.format(date);
								    
					// Setting creation date
					product.setLastModifiedDate(java.sql.Date.valueOf(strDate));
		
		product.setUser(userRepository.findByEmailId(productDto.getUserEmailId()));
		product.setSupplier(supplierService.getSupplier(productDto.getSupplierId()));
		product.setBuyer(buyerService.getBuyer(productDto.getBuyerId()));
		
		
		return productRepository.save(product);
	}

	
}
