package com.sanjay;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sanjay.config.Config;
import com.sanjay.model.Product;

@SpringBootApplication
public class ProducerJsmApplication implements CommandLineRunner {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ProducerJsmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product product = new Product(123, "abc", 100, "xyz", 5);
		System.out.println("Sending message...");
		rabbitTemplate.convertAndSend(Config.topicExchangeName,
				"message_routing_key", product);
		System.out.println("Message sent successfully...");
		
	}
	
	

}
