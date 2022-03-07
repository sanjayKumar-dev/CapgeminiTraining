package com.sanjay.question9.order;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderRepository extends MongoRepository<Order, Integer> {

}
