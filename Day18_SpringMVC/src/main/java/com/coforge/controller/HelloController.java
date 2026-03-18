package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/hellocontroller")
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from hello controller";
	}
}
