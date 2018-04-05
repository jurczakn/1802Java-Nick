package com.revature.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Hotel {
	
	@Id
	private Integer id;
	
	@Min(value=0)
	private double price;
	
	private String info;
	
	public Hotel() {}
	
	public Hotel(double price, String info) {
		super();
		this.price = price;
		this.info = info;
	}


	public Hotel(Integer id, double price, String info) {
		super();
		this.id = id;
		this.price = price;
		this.info = info;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	@Override
	public String toString() {
		return "Hotel [id=" + id + ", price=" + price + ", info=" + info + "]";
	}
	
	

}
