package com.study.futurelab.presentation.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping("/")
	public String getMainPage(Model model) {
		return "index";
	}
	
	@GetMapping("/chat")
	public String getChattingPage(Model model) {
		return "chat";
	}
	
	@GetMapping("/login")
	public String getLoginPage(Model model) {
		return "signin";
	}
}
