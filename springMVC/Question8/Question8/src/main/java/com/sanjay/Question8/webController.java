package com.sanjay.Question8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class webController {
	@RequestMapping("/myWeb")
	public ModelAndView myfun() {
		ModelAndView mv = new ModelAndView("myWeb");
		return mv;
	}

}
