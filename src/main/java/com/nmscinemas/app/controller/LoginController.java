package com.nmscinemas.app.controller;

import com.nmscinemas.app.beans.User;
import com.nmscinemas.app.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	IUserService service;
	
	@RequestMapping()
	public ModelAndView home() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Home");
		return mv;
	}
	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public ModelAndView addUser(User user) {
		
		service.addUser(user);
		
		return new ModelAndView("redirect:/login");
		
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public ModelAndView loginLoad() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("Login");
		
		return mv;
	}
	
	@RequestMapping(value="/loginUser",method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,HttpSession session) {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean isValid = service.checkUser(username, password);
		if(isValid){
			
			User user = service.findUser(username,password);
			String role = user.getRole();
			String uname = user.getUsername();
			int uid = user.getUid();
			
			session.setAttribute("role",role);
			session.setAttribute("username",uname);
			session.setAttribute("uid", uid);
			
			String role1 = (String) session.getAttribute(role);
			
			if(role1.equalsIgnoreCase("admin")) {
				
				return new ModelAndView("redirect:/admin/get");
			}
			else if(role.equalsIgnoreCase("user")) {
				
				return new ModelAndView("redirect:/user/get");
			}
			
		}
		return new ModelAndView("redirect:/login");
		
	}
	
	
	
	

}
