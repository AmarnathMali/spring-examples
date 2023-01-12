package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo {

	@RequestMapping("/")
	public String demo(){
		return "index";
		
	}
	
	
	@RequestMapping("/wel")
	public String test(){
		return "welcome";
	}
}
