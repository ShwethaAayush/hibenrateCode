package com.mphasis.training.Entity;
	

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Location{

	@Id
	private String lcode;
	
	@Column(length=10,unique=true)
	private String lname;

	public String getLcode() {
		return lcode;
	}

	public void setLcode(String lcode) {
		this.lcode = lcode;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Location() {
		super();
		
	}

	public Location(String lcode, String lname) {
		super();
		this.lcode = lcode;
		this.lname = lname;

	}

	@Override
	public String toString() {
		return "Location [lcode=" + lcode + ", lname=" + lname + "]";
	}

	}
