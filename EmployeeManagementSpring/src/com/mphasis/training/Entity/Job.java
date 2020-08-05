package com.mphasis.training.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
	private int jcode;
	private String jname;

public int getJcode() {
	return jcode;
}  

public void setJcode(int jcode) {
	this.jcode = jcode;
}

public String getJname() {
	return jname;
}

public void setJname(String jname) {
	this.jname = jname;
}

public Job() {
	super();
	
}

public Job(int jcode, String jname) {
	super();
	this.jcode = jcode;
	this.jname = jname;
}

@Override
public String toString() {
	return "Job [jcode=" + jcode + ", jname=" + jname + "]";
}
	
	
	
}

