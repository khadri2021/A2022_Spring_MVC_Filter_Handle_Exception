package com.khadri.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {

	@RequestMapping("/error")
	public ModelAndView exceptionHandler(HttpServletRequest request) {
		ModelAndView view = new ModelAndView();
		view.setViewName("error-page");
		view.addObject("e",request.getAttribute("error"));
		return view;
	}
	@RequestMapping("/success")
	public ModelAndView sucessHandler(HttpServletRequest request) {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("success-page");
		view.addObject("s","Welcome To Application");
		return view;
	}

}
