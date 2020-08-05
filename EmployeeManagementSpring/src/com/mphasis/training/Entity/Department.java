package com.mphasis.training.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Department{
   @Id
	private int dcode;

   @Column(length=12)
	private String dname;
	
	@ManyToOne  //many department one location
	@JoinColumn(name="lcode")
	private Location loc=new Location();

	public int getDcode() 
	{
		return dcode;
	}

	public void setDcode(int dcode) {
		this.dcode = dcode;
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

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dcode, String dname, Location loc) {
		super();
		this.dcode = dcode;
		this.dname = dname;
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Department [dcode=" + dcode + ", dname=" + dname + ", loc=" + loc + "]";
	}


	
	
	
	
}

