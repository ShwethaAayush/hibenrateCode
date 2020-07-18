package com.mphasis.training.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="morder")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	private Date ordered_date;
	private double totalCost;
	@OneToOne
	@JoinColumn(name="cust_id")
	private Customer customer=new Customer();
	@ManyToMany
	private Set<Product> products=new HashSet<>();
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Date getOrdered_date() {
		return ordered_date;
	}
	public void setOrdered_date(Date ordered_date) {
		this.ordered_date = ordered_date;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
	
	
	
}
