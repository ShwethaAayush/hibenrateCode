package com.mphasis.training.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Department {

	@Id
	private int deptcode;
	
	@Override
	public String toString() {
		return "Department [deptcode=" + deptcode + ", dname=" + dname  + "]";
	}

	@Column(length = 12)
	private String dname;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="lcode")
	private Location loc=new Location();

	public int getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}
	
	
	
	
	
}
