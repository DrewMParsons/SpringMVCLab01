package com.springmvc.homecontroller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.ContactInfo;
import com.springmvc.model.PrivateInfo;
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
	public ModelAndView displayForm() {
		ModelAndView mav = new ModelAndView("form");
		return mav;
	}
	
	@RequestMapping(value="/process-form",method=RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("user")@Valid User user,
			BindingResult errors) {
		if(errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("form");
			return mav;
		}
		ModelAndView mav = new ModelAndView("submission-details");
		return mav;
	}
	
	@InitBinder("user")
	public void initBinder(WebDataBinder binder) {
	    binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	    binder.registerCustomEditor(Date.class, 
	    		new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10)); 
	    
	    
	}
	
	
	

}
