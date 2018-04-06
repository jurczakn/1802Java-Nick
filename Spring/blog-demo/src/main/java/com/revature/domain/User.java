package com.revature.domain;

import java.util.HashSet;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="BLOG_USER")
public class User {
	
	@Id
	@Column(name="U_ID")
	@SequenceGenerator(name="BLOGUSER_SEQ", sequenceName="BLOGUSER_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "BLOGUSER_SEQ")
	private int id;
	
	@Column(name="USERNAME", nullable=false, unique=true)
	private String username;
	
	@Column(name="PASSWORD", nullable=false)
	private String password;	
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="FOLLOWING",
	joinColumns=@JoinColumn(name="USER_ID"),
	inverseJoinColumns=@JoinColumn(name="FOLLOWER_ID"))
	private Set<User> followers = new HashSet<User>();

	public User() {}
		
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User(String username, String password, Set<User> followers) {
		super();
		this.username = username;
		this.password = password;
		this.followers = followers;
	}

	public User(int id, String username, String password, Set<User> followers) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.followers = followers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<User> getFollowers() {
		return followers;
	}

	public void setFollowers(Set<User> followers) {
		this.followers = followers;
	}
	
	
}


