package com.cos.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/auth/joinForm")
	public String joinFrom() {
		return "user/joinForm";
	}
	
	@GetMapping("/auth/loginForm")
	public String loginFrom() {
		return "user/loginForm";
	}
}