package edu.iss.caps.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.iss.caps.service.*;
import edu.iss.caps.controller.UserSession;
import edu.iss.caps.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserService uservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indexPage(Model model) {
		model.addAttribute("user", new User());
		UserSession us = new UserSession();
		if(us.isLogedIn()){
			return  "";
		}else{
			return "homePage/index";
		}
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView authenticate(@ModelAttribute User user, HttpSession session, BindingResult result) {
		ModelAndView mav = new ModelAndView("login");
		if (result.hasErrors())
			return mav;
		UserSession us = new UserSession();
		if (user.getUsername() != null && user.getPassword() != null) {
			User u = uservice.authenticate(user.getUsername(), user.getPassword());
			us.setUser(u);
			us.setLogedIn(true);
			// PUT CODE FOR SETTING SESSION ID
			us.setSessionId(session.getId());
//			mav = new ModelAndView("redirect:/staff/history");
			mav = new ModelAndView("admin/adminIndex");
		} else {
			return mav;
		}
		session.setAttribute("USERSESSION", us);
		return mav;
	}

	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView newCoursePage() {
		ModelAndView mav = new ModelAndView("list-users");
		mav.addObject("ulist", uservice.findAllUsers());
		return mav;
	}
	

	
}
