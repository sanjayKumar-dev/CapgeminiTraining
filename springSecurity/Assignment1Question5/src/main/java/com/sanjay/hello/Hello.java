package com.sanjay.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/")
	public String helloCalling() {
		return "<h1> HEllo </h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		return ("<h1> Welcome User </h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Welcome Admin";
	}

}
