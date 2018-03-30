package com.revature.domains;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
}
