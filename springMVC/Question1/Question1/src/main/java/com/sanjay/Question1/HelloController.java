package com.sanjay.Question1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/helloWorld.html")
	public ModelAndView hello() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello World!");
		return model;
	}
}
