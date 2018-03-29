package com.revature.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HONEYPOT")
public class HoneyPot {

	@Id
	@Column(name="HONEYPOT_ID")
	@SequenceGenerator(name="HONEYPOTID_SEQ", sequenceName="HONEYPOTID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HONEYPOTID_SEQ")
	private int honeypotID;
	
	@Column(name="VOLUME")
	private double volume;
	
	@Column(name="HONEYPOT_AMOUNT")
	private double honeyAmount;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(honeyAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + honeypotID;
		temp = Double.doubleToLongBits(volume);
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
		HoneyPot other = (HoneyPot) obj;
		if (Double.doubleToLongBits(honeyAmount) != Double.doubleToLongBits(other.honeyAmount))
			return false;
		if (honeypotID != other.honeypotID)
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HoneyPot [honeypotID=" + honeypotID + ", volume=" + volume + ", honeyAmount=" + honeyAmount + "]";
	}

	public HoneyPot(int honeypotID, double volume, double honeyAmount) {
		super();
		this.honeypotID = honeypotID;
		this.volume = volume;
		this.honeyAmount = honeyAmount;
	}

	public HoneyPot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getHoneypotID() {
		return honeypotID;
	}

	public void setHoneypotID(int honeypotID) {
		this.honeypotID = honeypotID;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getHoneyAmount() {
		return honeyAmount;
	}

	public void setHoneyAmount(double honeyAmount) {
		this.honeyAmount = honeyAmount;
	}
	
}
