package com.sanjay.question9.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
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
	
	public Optional<Order> getOrder(int id) {
		return orderRepository.findById(id);
	}
	
	public void updateOrder(Order order) {
		orderRepository.save(order);			
	}
	
	public void deleteOrder(int id) {
		orderRepository.deleteById(id);
	}

}
