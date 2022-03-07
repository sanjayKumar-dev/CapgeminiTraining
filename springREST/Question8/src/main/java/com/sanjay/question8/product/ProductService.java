package com.sanjay.question8.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository  productRepository; 
	
	public List<Product> getAllProduct(){
		List<Product> product = new ArrayList<>();
		productRepository.findAll().forEach(product::add);
		return product;
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public Optional<Product> getProduct(String id) {
		return productRepository.findById(id);
	}
	
	public void updateProduct(Product product) {
		productRepository.save(product);			
	}
	
	public void deleteProduct(String id) {
		productRepository.deleteById(id);
	}

}
