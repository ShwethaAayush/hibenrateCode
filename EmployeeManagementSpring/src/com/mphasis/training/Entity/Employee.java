package com.mphasis.training.Entity;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee{

	   @Id
	   @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="emp_seq")
	   @SequenceGenerator(sequenceName="employee_Seq",allocationSize=1,name="emp_seq")
	   private int eid;

	   @Column(length=20)
       private String ename;
	
	   private String doj;
	   private double bonus;
	   private double salary;
	   
	    @ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name="mgno")
		private Employee manager;
	   
	   @OneToMany(mappedBy="manager")
	   private Set<Employee> subordinates = new HashSet<Employee>();
	   
	   @OneToMany(mappedBy="lemployee")
	   private List<Leave> leave = new ArrayList<Leave>();
	   
	   @OneToOne(fetch = FetchType.EAGER)
	   @JoinColumn(name="login")
	   private Login login;
	   
	   
	   @OneToOne
	   @JoinColumn(name="jcode")
	   private Job job;
	   
	   
	   @ManyToOne(fetch = FetchType.EAGER)
	   @JoinColumn(name="dcode")
	   private Department department;


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getDoj() {
		return doj;
	}


	public void setDoj(String doj) {
		this.doj = doj;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Employee getManager() {
		return manager;
	}


	public void setManager(Employee manager) {
		this.manager = manager;
	}


	public Set<Employee> getSubordinates() {
		return subordinates;
	}


	public void setSubordinates(Set<Employee> subordinates) {
		this.subordinates = subordinates;
	}


	public Job getJob() {
		return job;
	}


	public void setJob(Job job) {
		this.job = job;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int eid, String ename, String doj, double bonus, double salary, Employee manager,
			Set<Employee> subordinates, Job job, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.doj = doj;
		this.bonus = bonus;
		this.salary = salary;
		this.manager = manager;
		this.subordinates = subordinates;
		this.job = job;
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", doj=" + doj + ", bonus=" + bonus + ", salary=" + salary
				+ ", manager=" + manager + ", subordinates=" + subordinates + ", job=" + job + ", department="
				+ department + "]";
	}


			   

}

