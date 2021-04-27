package com.shreyatronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shreyatronics.entities.ToggleSwitch;
import com.shreyatronics.service.GilardProductService;

@RestController
public class ApiController {

	@Autowired
	private GilardProductService gilardProductService;
	
	@GetMapping("/api/get/toggle-switches")
	public List<ToggleSwitch> getToggleSwitches(){
		return gilardProductService.findAllToggleSwitches();
	}
	
	
	
}
