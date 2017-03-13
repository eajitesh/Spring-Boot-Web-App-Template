package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/account/*")
public class UserAccountController {
	
	@GetMapping
	public String login() {
		return "login";
    }
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
    }	

	@PostMapping("/signup/process")
	public ModelAndView processSignup(ModelMap model, @RequestParam("nickname") String nickname,
			@RequestParam("emailaddress") String emailAddress, @RequestParam("password") String password) {
		model.addAttribute("login", true);
		model.addAttribute("nickname", nickname);
		model.addAttribute("message", "Have a great day ahead.");
		return new ModelAndView("index", model);
	}
	
	@GetMapping("/forgotpassword")
	public String forgotpassword() {
		return "forgotpassword";
    }
}
