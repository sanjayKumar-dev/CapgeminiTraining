package com.sanjay.Question2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping("/SICal.html")
	public ModelAndView hello(@ModelAttribute("si") SI si) {
		ModelAndView model = new ModelAndView("simpleInterest");
		model.addObject("msg", si.getInterest());
		return model;
	}
}