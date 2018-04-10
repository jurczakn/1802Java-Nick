package com.ex.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Home {
	
	@Id
	private Integer id;
	
	@Min(value=0)
	private double sellPrice;
	
	private String address;

	public Home() {}

	public Home(Integer id, double sellPrice, String address) {
		super();
		this.id = id;
		this.sellPrice = sellPrice;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	

}
