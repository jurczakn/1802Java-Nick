package com.revature.domains;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="BEAR")
public class Bear {
	
	@Id
	@Column(name = "BEAR_ID")
	@SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEARID_SEQ")
	private int bearId;
	
	@Column(name = "BEAR_COLOR")
	private String bearColor;
	
	@Column(name = "BREED")
	private String breed;
	
	@Column(name = "WEIGHT")
	private double weight;
	
	
	@Column(name = "HEIGHT")
	private double height;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="BEAR_HOME")
	private Cave bearHome;

	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="HONEYPOT_ID")
	private HoneyPot honeyPot;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="PARENT_CUB",
			joinColumns=@JoinColumn(name="BEAR_ID"),
			inverseJoinColumns=@JoinColumn(name="CUB_ID"))
	private Set<Bear> bearCubs;

	public int getBearId() {
		return bearId;
	}

	public void setBearId(int bearId) {
		this.bearId = bearId;
	}

	public String getBearColor() {
		return bearColor;
	}

	public void setBearColor(String bearColor) {
		this.bearColor = bearColor;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Cave getBearHome() {
		return bearHome;
	}

	public void setBearHome(Cave bearHome) {
		this.bearHome = bearHome;
	}

	public HoneyPot getHoneyPot() {
		return honeyPot;
	}

	public void setHoneyPot(HoneyPot honeyPot) {
		this.honeyPot = honeyPot;
	}

	public Set<Bear> getBearCubs() {
		return bearCubs;
	}

	public void setBearCubs(Set<Bear> bearCubs) {
		this.bearCubs = bearCubs;
	}

	@Override
	public String toString() {
		return "Bear [bearId=" + bearId + ", bearColor=" + bearColor + ", breed=" + breed + ", weight=" + weight
				+ ", height=" + height + ", bearHome=" + bearHome.getCaveId() + ", honeyPot=" + honeyPot + ", bearCubs=" + bearCubs
				+ "]";
	}

	public Bear(int bearId, String bearColor, String breed, double weight, double height, Cave bearHome,
			HoneyPot honeyPot, Set<Bear> bearCubs) {
		super();
		this.bearId = bearId;
		this.bearColor = bearColor;
		this.breed = breed;
		this.weight = weight;
		this.height = height;
		this.bearHome = bearHome;
		this.honeyPot = honeyPot;
		this.bearCubs = bearCubs;
	}

	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bearColor == null) ? 0 : bearColor.hashCode());
		result = prime * result + ((bearCubs == null) ? 0 : bearCubs.hashCode());
		result = prime * result + ((bearHome == null) ? 0 : bearHome.hashCode());
		result = prime * result + bearId;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((honeyPot == null) ? 0 : honeyPot.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bear other = (Bear) obj;
		if (bearColor == null) {
			if (other.bearColor != null)
				return false;
		} else if (!bearColor.equals(other.bearColor))
			return false;
		if (bearCubs == null) {
			if (other.bearCubs != null)
				return false;
		} else if (!bearCubs.equals(other.bearCubs))
			return false;
		if (bearHome == null) {
			if (other.bearHome != null)
				return false;
		} else if (!bearHome.equals(other.bearHome))
			return false;
		if (bearId != other.bearId)
			return false;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (honeyPot == null) {
			if (other.honeyPot != null)
				return false;
		} else if (!honeyPot.equals(other.honeyPot))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	
}