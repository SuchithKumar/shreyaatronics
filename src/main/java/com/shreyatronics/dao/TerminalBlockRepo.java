package com.shreyatronics.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shreyatronics.entities.TerminalBlock;

public interface TerminalBlockRepo extends JpaRepository<TerminalBlock, Integer> {
	
	public List<TerminalBlock> findAllByOrderBySeries();

}
