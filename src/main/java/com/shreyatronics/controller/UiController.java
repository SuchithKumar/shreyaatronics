package com.shreyatronics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shreyatronics.service.GilardProductServiceImpl;

@Controller
public class UiController {
	
	@Autowired
	private GilardProductServiceImpl gilardProductService;
	
	@GetMapping(path = "/index")
	public String getIndexPage() {
		return "index";
	}
	
	@GetMapping(path = "/gilard")
	public String getGilardPage(Model model) {
		model.addAttribute("toggleSwitches", gilardProductService.findAllToggleSwitches());
		model.addAttribute("toggleSwitchTypes", gilardProductService.getUniqueToggleSwitchType());
		return "gilard";
	}
	
	@GetMapping(path = "/sonya")
	public String getSonyaPage() {
		return "sonya";
	}
}
