package com.example.Question1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@RequestMapping("/hello")
	public String sayHi() {
		return "<h1> Hi </h1>";
	}

}
