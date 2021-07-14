package com.shreyatronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shreyatronics.entities.Gilard;
import com.shreyatronics.entities.ToggleSwitch;
import com.shreyatronics.entities.User;
import com.shreyatronics.service.GilardProductService;

@RestController
public class ApiController {

	@Autowired
	private GilardProductService gilardProductService;

	@ResponseBody
	@GetMapping("/api/public/toggle-switches")
	@CrossOrigin
	public List<ToggleSwitch> getToggleSwitches(){
		return gilardProductService.findAllToggleSwitches();
	}

	@ResponseBody
	@GetMapping("/api/public/gilard")
	@CrossOrigin
	public Gilard getGilardProducts() {
		Gilard gilard = new Gilard();
		gilard.setToggleSwitches(gilardProductService.findAllToggleSwitches());
		gilard.setTerminalBlocks(gilardProductService.findAllTerminalBlocks());
		return gilard;

	}


}
