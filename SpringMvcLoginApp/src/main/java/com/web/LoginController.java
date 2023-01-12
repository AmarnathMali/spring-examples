package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/lurl")
	public String demo()
	{
		return "login";
	}

	@RequestMapping("/lgurl")
	//public String process(HttpServletRequest req,Model m)
	public String process(@RequestParam("uname") String username , @RequestParam("pass") String password , Model m)
	{
		//String username = req.getParameter("uname");
		//String password = req.getParameter("pass");
		if((username.equals("admin")) && (password.equals("admin123")))
		{
			String msg = "Welcome "+username;
			m.addAttribute("me",msg);
			return "success";
		}
		else
		{
			String msg = "sorry "+username+" you entered wrong password";
			m.addAttribute("me",msg);
			return "fail";
		}
 	}
}

