package com.revature.domains;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAVE")
public class Cave {
	
	@Id
	@Column(name="CAVE_ID")
	@SequenceGenerator(name="CAVEID_SEQ", sequenceName="CAVEID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CAVEID_SEQ")
	private int caveId;
	
	@Column(name="CAVE_TYPE")
	private String caveType;
	
	@Column(name="SQ_FOOTAGE")
	private double sqFootage;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.MERGE, mappedBy="bearHome")
	private Set<Bear> residents = new HashSet<Bear>();

	public Cave(int caveId, String caveType, double sqFootage, Set<Bear> residents) {
		super();
		this.caveId = caveId;
		this.caveType = caveType;
		this.sqFootage = sqFootage;
		this.residents = residents;
	}

	public Cave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCaveId() {
		return caveId;
	}

	public void setCaveId(int caveId) {
		this.caveId = caveId;
	}

	public String getCaveType() {
		return caveType;
	}

	public void setCaveType(String caveType) {
		this.caveType = caveType;
	}

	public double getSqFootage() {
		return sqFootage;
	}

	public void setSqFootage(double sqFootage) {
		this.sqFootage = sqFootage;
	}

	public Set<Bear> getResidents() {
		return residents;
	}

	public void setResidents(Set<Bear> residents) {
		this.residents = residents;
	}

	@Override
	public String toString() {
		return "Cave [caveId=" + caveId + ", caveType=" + caveType + ", sqFootage=" + sqFootage + ", residents="
				+ residents + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + caveId;
		result = prime * result + ((caveType == null) ? 0 : caveType.hashCode());
		result = prime * result + ((residents == null) ? 0 : residents.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sqFootage);
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
		Cave other = (Cave) obj;
		if (caveId != other.caveId)
			return false;
		if (caveType == null) {
			if (other.caveType != null)
				return false;
		} else if (!caveType.equals(other.caveType))
			return false;
		if (residents == null) {
			if (other.residents != null)
				return false;
		} else if (!residents.equals(other.residents))
			return false;
		if (Double.doubleToLongBits(sqFootage) != Double.doubleToLongBits(other.sqFootage))
			return false;
		return true;
	}

	
}
