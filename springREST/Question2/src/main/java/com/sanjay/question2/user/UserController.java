package com.sanjay.question2.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/{userName}/{pass}")
	public String validate(@PathVariable String userName, @PathVariable String pass) {
		return userService.auth(userName, pass);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/user" )
	public void addTopic(@RequestBody User user) {
		userService.addUser(user);
	}

}
