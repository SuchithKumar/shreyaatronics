package com.shreyatronics.entities;

import java.util.List;

public class Gilard {

	private List<ToggleSwitch> toggleSwitches;
	private List<TerminalBlock> terminalBlocks;
	
	public Gilard() {
		
	}
	
	public Gilard(List<ToggleSwitch> toggleSwitches, List<TerminalBlock> terminalBlocks) {
		super();
		this.toggleSwitches = toggleSwitches;
		this.terminalBlocks = terminalBlocks;
	}
	public List<ToggleSwitch> getToggleSwitches() {
		return toggleSwitches;
	}
	public void setToggleSwitches(List<ToggleSwitch> toggleSwitches) {
		this.toggleSwitches = toggleSwitches;
	}
	public List<TerminalBlock> getTerminalBlocks() {
		return terminalBlocks;
	}
	public void setTerminalBlocks(List<TerminalBlock> terminalBlocks) {
		this.terminalBlocks = terminalBlocks;
	}

	@Override
	public String toString() {
		return "Gilard [toggleSwitches=" + toggleSwitches + ", terminalBlocks=" + terminalBlocks + "]";
	}
	
	
	
}
