package com.sanjay.Question6;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController 
{
	@RequestMapping("/register")
	public String displayRegister(Model m)
	{
		m.addAttribute("customer", new Customer());
		return "registration";
	}
	
	@RequestMapping("/registeragain")
	public String submitForm(@Valid@ModelAttribute("customer") Customer e, BindingResult br)
	{
		if(br.hasErrors())
		{
			return "registration";
		}
		else
		{
			return "final";
		}
	}
	
}
