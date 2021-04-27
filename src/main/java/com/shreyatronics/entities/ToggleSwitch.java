package com.shreyatronics.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToggleSwitch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String description;

	private String poleType;

	@Column(name = "amps_6")
	private String amps6;

	@Column(name = "amps_10")
	private String amps10;

	@Column(name = "amps_15")
	private String amps15;

	@Column(name = "amps_20")
	private String amps20;

	private ToggleSwitch() {

	}

	public ToggleSwitch(String description, String poleType, String amps_6, String amps_10, String amps_15,
			String amps_20) {
		super();
		this.description = description;
		this.poleType = poleType;
		this.amps6 = amps_6;
		this.amps10 = amps_10;
		this.amps15 = amps_15;
		this.amps20 = amps_20;
		
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

	public String getPoleType() {
		return poleType;
	}

	public void setPoleType(String poleType) {
		this.poleType = poleType;
	}

	public String getAmps6() {
		return amps6;
	}

	public void setAmps6(String amps6) {
		this.amps6 = amps6;
	}

	public String getAmps10() {
		return amps10;
	}

	public void setAmps10(String amps10) {
		this.amps10 = amps10;
	}

	public String getAmps15() {
		return amps15;
	}

	public void setAmps15(String amps15) {
		this.amps15 = amps15;
	}

	public String getAmps20() {
		return amps20;
	}

	public void setAmps20(String amps20) {
		this.amps20 = amps20;
	}
	

	@Override
	public String toString() {
		return String.format(
				"ToggleSwitch [id=%s, description=%s, poleType=%s, amps_6=%s, amps_10=%s, amps_15=%s, amps_20=%s]", id,
				description, poleType, amps6, amps10, amps15, amps20);
	}

}
