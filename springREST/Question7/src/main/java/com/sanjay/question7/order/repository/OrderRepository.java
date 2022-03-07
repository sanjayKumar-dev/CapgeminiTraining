package com.sanjay.question7.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sanjay.question7.order.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
