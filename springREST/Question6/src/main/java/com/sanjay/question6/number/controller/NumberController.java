package com.sanjay.question6.number.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
	
	@RequestMapping(value="/add/{num1}/{num2}")
	public int addNumber(@PathVariable int num1, @PathVariable int num2) {
		return (num1+num2);
		
	}
	
	@RequestMapping(value="/sub/{num1}/{num2}")
	public int subNumber(@PathVariable int num1, @PathVariable int num2) {
		return (num1-num2);
		
	}
	
	@RequestMapping(value="/mul/{num1}/{num2}")
	public int mulNumber(@PathVariable int num1, @PathVariable int num2) {
		return (num1*num2);
	}
	
	@RequestMapping(value="/div/{num1}/{num2}")
	public int divNumber(@PathVariable int num1, @PathVariable int num2) {
		return (num1/num2);
	}
	
	@RequestMapping(value="/sqrt/{num1}")
	public int sqrtNumber(@PathVariable int num1) {
		return (int) Math.sqrt(num1);
	}

}
