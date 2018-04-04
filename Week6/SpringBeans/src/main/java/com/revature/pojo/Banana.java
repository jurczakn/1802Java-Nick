package com.revature.pojo;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Banana {
	
	@Autowired
	@Qualifier("myPeel")
	@Resource
	@Inject
	private Peel peel;
	
	private String name;

	public Banana() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	public Banana(Peel peel, String name) {
		super();
		this.peel = peel;
		this.name = name;
	}

	public Peel getPeel() {
		return peel;
	}

	//@Autowired
	public void setPeel(Peel peel) {
		this.peel = peel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Banana [peel=" + peel + ", name=" + name + "]";
	}

}
