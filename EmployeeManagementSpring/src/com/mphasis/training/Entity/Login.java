package com.mphasis.training.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Login {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="l_seq")
	 @SequenceGenerator(sequenceName="login_Seq",allocationSize=1,name="l_seq")
	 private int id;
	 private String Username;
	 private String Password;
	 private String Role;
	 
	 @OneToOne(mappedBy="login")
	 private Employee employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Login(int id, String username, String password, String role, Employee employee) {
		super();
		this.id = id;
		Username = username;
		Password = password;
		Role = role;
		this.employee = employee;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", Username=" + Username + ", Password=" + Password + ", Role=" + Role
				+ ", employee=" + employee + "]";
	}
	 
	 
	 
	 
	 	 
}
