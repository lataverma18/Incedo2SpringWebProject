package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {

	//handler Methods
	@RequestMapping("/a1")
	public ModelAndView processRequest1()
	{
		String d="MyData Value";
		ModelAndView mv=new ModelAndView("view1");
		mv.addObject("data",d);
		return mv;
	}
	@RequestMapping("/greet")
	public ModelAndView greet()
	{
		String d="Hello!!! Welcome to Incedo!!!";
		ModelAndView mv=new ModelAndView("view2");
		mv.addObject("data",d);
		return mv;
	}
}
