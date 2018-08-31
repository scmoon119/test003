package com.scmoon.test003;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {
	
	@RequestMapping("/login")
	public String login(Model model) {
		
		model.addAttribute("loginkey", "helloMyKey"); 
		return "login";  // login.jsp 가 실행이 된다. 
	}
}
