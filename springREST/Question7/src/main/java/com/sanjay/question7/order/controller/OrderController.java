package com.sanjay.question7.order.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.question7.order.Order;
import com.sanjay.question7.order.service.ProductService;

@RestController
public class OrderController {
	
	@Autowired
	private ProductService orderService;
	
	@RequestMapping("/order")
	public List<Order> getAllTopic(){
		return orderService.getAllOrder();
	}	
	
	@RequestMapping(method=RequestMethod.POST, value="/order" )
	public void addTopic(@RequestBody Order order) {
		orderService.placeOrder(order);
	}

	@RequestMapping("/order/{id}")
	public Optional<Order> getOrder(@PathVariable String id) {
		return orderService.getOrder(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/order/{id}" )
	public void updateOrder(@RequestBody Order order, @PathVariable String id) {
		orderService.updateOrder(order);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/order/{id}")
	public void deleteOrder(@PathVariable String id) {
		orderService.deleteOrder(id);
	}
}
