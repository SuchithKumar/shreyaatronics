package com.shreyatronics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UiController {
	
	@GetMapping(path = "/index")
	public String getIndexPage() {
		return "index";
	}
}
