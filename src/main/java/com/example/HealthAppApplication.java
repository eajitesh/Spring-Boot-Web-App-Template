package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class HealthAppApplication {
	
	@RequestMapping("/") 	
    public String usingRequestParam(Model model, @RequestParam(value="name", required=false) String nickname) {
		model.addAttribute("nickname", nickname);
	System.out.println("Name: " + nickname);
		return "index";
    }
	
	@GetMapping("/{nickname}") 	
    public String usingPathVariable(Model model, @PathVariable String nickname) {
        model.addAttribute("nickname", nickname);
		return "index";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(HealthAppApplication.class, args);
	}
}
