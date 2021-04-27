package com.shreyatronics.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreyatronics.dao.ToggleSwitchRepo;
import com.shreyatronics.entities.ToggleSwitch;

@Service
public class GilardProductServiceImpl implements GilardProductService {

	@Autowired
	private ToggleSwitchRepo toggleSwitchRepo;

	@Override
	public List<ToggleSwitch> findAllToggleSwitches() {
		return toggleSwitchRepo.findAll();
	}

	public List<String> getUniqueToggleSwitchType() {
		List<String> toggleSwitchTypes = new ArrayList<>();
		toggleSwitchTypes.add(0,"Single Pole");
		toggleSwitchTypes.add(1,"Double Pole");
		toggleSwitchTypes.add(2,"Triple Pole");
		toggleSwitchTypes.add(3,"Four Pole");
		return toggleSwitchTypes;
	}

}
