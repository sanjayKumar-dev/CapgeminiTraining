package com.sanjay.question2.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public String auth(String userName, String pass) {
		
		Optional<User> user = userRepository.findById(userName);
		String str = user.get().getUserPass();
		if(str.equals(pass))
		{			
			return "Valid User";
		}
		else
		return "Invalid User";
	}

	public void addUser(User user) {
		userRepository.save(user);
	}

}
