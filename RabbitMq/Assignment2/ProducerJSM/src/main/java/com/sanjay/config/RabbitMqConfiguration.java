package com.sanjay.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class RabbitMqConfiguration {
	public static final String topicExchangeName = "message_queue_exchange";

	@Bean
	Queue SportsQueue() {
		return new Queue("sportsQueue", false);
	}

	@Bean
	Queue TechnichalQueue() {
		return new Queue("technichalQueue", false);
	}

	@Bean
	Queue PoliticalQueue() {
		return new Queue("politicalQueue", false);
	}

	@Bean
	Queue WordQueue() {
		return new Queue("wordQueue", false);
	}

	@Bean
	Queue ScienceQueue() {
		return new Queue("scienceQueue", false);
	}

	@Bean
	TopicExchange topicExchange() {
		return new TopicExchange("topic-exchange");
	}
	
	@Bean
	Binding sportsBinding(Queue sportsQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(sportsQueue).to(topicExchange).with("queue.sports");
	}
	@Bean
	Binding technichalBinding(Queue technichalQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(technichalQueue).to(topicExchange).with("queue.technichal");
	}
	@Bean
	Binding politicalBinding(Queue politicalQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(politicalQueue).to(topicExchange).with("queue.political");
	}
	@Bean
	Binding scienceBinding(Queue scienceQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(scienceQueue).to(topicExchange).with("queue.science");
	}
	@Bean
	Binding wordBinding(Queue wordQueue, TopicExchange topicExchange) {
		return BindingBuilder.bind(wordQueue).to(topicExchange).with("queue.word");
	}
	@Bean
	public ConnectionFactory connectionFactory()
	{
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory(
				"localhost");
		connectionFactory.setPort(5672);
		connectionFactory.setUsername("guest");
		connectionFactory.setPassword("guest");
		return connectionFactory;
	}
}