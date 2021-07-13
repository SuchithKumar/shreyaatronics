package com.shreyatronics.service;

import java.util.List;

import com.shreyatronics.entities.TerminalBlock;
import com.shreyatronics.entities.ToggleSwitch;

public interface GilardProductService {

	List<ToggleSwitch> findAllToggleSwitches();
	List<TerminalBlock> findAllTerminalBlocks();


}
