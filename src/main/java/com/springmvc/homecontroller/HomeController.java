package com.springmvc.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.User;

@Controller
@SessionAttributes("user")
public class HomeController
{
	
	
	@ModelAttribute("user")
	public User setUpSessionUser() {
		return new User();
	}

	
	@RequestMapping("/")
	public ModelAndView displayHomePage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	@RequestMapping("/form")
	public ModelAndView displayForm(@ModelAttribute("user")User user) {
		ModelAndView mav = new ModelAndView("form");
		return mav;
	}
	
	@RequestMapping(value="/process-form",method=RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("user")User user) {
		ModelAndView mav = new ModelAndView("submission-details");
		return mav;
	}
	
	
	

}
