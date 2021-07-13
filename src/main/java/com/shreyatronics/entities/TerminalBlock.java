package com.shreyatronics.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TerminalBlock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String description;
	
	private String series;
	
	private int numOfWays;
	
	private String partNumber;

	public TerminalBlock() {
		
	}
	
	public TerminalBlock(int id, String description, String series, int numOfWays, String partNumber) {
		super();
		this.id = id;
		this.description = description;
		this.series = series;
		this.numOfWays = numOfWays;
		this.partNumber = partNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public int getNumOfWays() {
		return numOfWays;
	}

	public void setNumOfWays(int numOfWays) {
		this.numOfWays = numOfWays;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	@Override
	public String toString() {
		return "TerminalBlock [id=" + id + ", description=" + description + ", series=" + series + ", numOfWays="
				+ numOfWays + ", partNumber=" + partNumber + "]";
	}
	
	
}
