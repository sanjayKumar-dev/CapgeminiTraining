package com.sanjay.Question3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController
{
	@RequestMapping("/login")
	public String display(HttpServletRequest r,Model m)
	{
		String name=r.getParameter("username");
		String  password=r.getParameter("password");
		String email=r.getParameter("email");
		
		if(password.equals("admin"))
		{
			String message=" Hello " +name;
			m.addAttribute("message",message);
			return "success";
		}
		else
		{
			String message="Sorry " +name+ "You entered incorrect details";
			m.addAttribute("message",message);
			return "error";
		}
	}
}