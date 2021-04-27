package com.shreyatronics.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreyatronics.entities.ToggleSwitch;

public interface ToggleSwitchRepo extends JpaRepository<ToggleSwitch, Integer> {
	
	public List<ToggleSwitch> findAllByOrderByPoleType();

}

