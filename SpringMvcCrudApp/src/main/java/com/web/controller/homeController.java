package com.web.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

	@GetMapping("/home")
	public String homeInit(Locale locale, Model model) {
		return "home";
	}
}
