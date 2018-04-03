package com.revature.pojo;

public class BananaPeel implements Peel {

	private String color;
	
	public BananaPeel() {
		super();
	}

	public BananaPeel(String color) {
		super();
		this.color = color;
	}



	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "BananaPeel [color=" + color + "]";
	}

}
