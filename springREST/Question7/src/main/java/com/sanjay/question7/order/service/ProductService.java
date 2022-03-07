package com.sanjay.question7.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanjay.question7.order.Order;
import com.sanjay.question7.order.repository.OrderRepository;

@Service
public class ProductService {
	
	@Autowired
	private OrderRepository  orderRepository; 
	
	public List<Order> getAllOrder(){
		List<Order> order = new ArrayList<>();
		orderRepository.findAll().forEach(order::add);
		return order;
	}
	
	public void placeOrder(Order order) {
		orderRepository.save(order);
	}
	
	public Optional<Order> getOrder(String id) {
		return orderRepository.findById(id);
	}
	
	public void updateOrder(Order order) {
		orderRepository.save(order);			
	}
	
	public void deleteOrder(String id) {
		orderRepository.deleteById(id);
	}

}
