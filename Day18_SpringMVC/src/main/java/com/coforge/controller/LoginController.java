package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody

public class LoginController {

	@RequestMapping("/login")
	public ModelAndView doLogin() {
		ModelAndView mv= new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/authenticate")
	public ModelAndView doauthentication(@RequestParam("uname") String uname, @RequestParam("pwd") String pwd) {
		
		String username = uname;
		String password = pwd;
		
		ModelAndView mv = new ModelAndView();
		if(username.equals("Mayank") && password.equals("Mayank123")) {
			mv.addObject("username", username);
			mv.setViewName("welcome");
		}
		else {
			mv.setViewName("error");
		}
		return mv;
	}
}
