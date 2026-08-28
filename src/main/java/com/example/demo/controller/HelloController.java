package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	
	@GetMapping("/")
	public String hello() {
		return "Hello from Spring Boot - GitHub Actions + version testing";
	}

}
