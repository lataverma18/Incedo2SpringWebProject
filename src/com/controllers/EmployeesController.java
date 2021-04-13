package com.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/*@Controller
@RequestMapping("/abc")
public class EmployeesController{
	@RequestMapping("/welcome")
	public ModelAndView welcome(){
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("name","Lata Verma");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping("/fetchEmp/{id}")
	public ModelAndView fetchingEmp(@PathVariable int id)
	{
		ModelAndView mv=new ModelAndView("employeeData");
		mv.addObject("eid", id);
		mv.addObject("ename", "Ronit");
		return mv;
	}
	@RequestMapping("/auth")
	public ModelAndView authentication(@RequestParam("user") String user,@RequestParam("pwd") String pwd)
	{
		ModelAndView mv=new ModelAndView("auth");
		boolean auth=false;
		if(user.equals("Lata") && pwd.equals("1234"))
			auth=true;
		if(auth==true)
			return mv;
		else
			return null;
	}
}
*/