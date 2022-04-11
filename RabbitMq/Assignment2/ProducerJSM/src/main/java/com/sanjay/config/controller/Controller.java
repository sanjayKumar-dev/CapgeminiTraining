package com.sanjay.config.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.config.RabbitMqConfiguration;

@RestController
public class Controller {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@GetMapping("/call")
	public String call() {
		System.out.println("Sending message...");
		rabbitTemplate.convertAndSend(RabbitMqConfiguration.topicExchangeName, "message_routing_key", "Hello");		
		return "Message send Successfully";		
	}

}
