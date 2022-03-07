package com.sanjay.question9.customer;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
