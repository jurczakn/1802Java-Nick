package com.revature.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="BLOG_POST")
public class Post {
	
	@Id
	@Column(name="P_ID")
	@SequenceGenerator(name="BLOGPOSTSEQ", sequenceName="BLOGPOSTSEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BLOGPOSTSEQ")
	private int id;
	
	@Column(name="CONTENT")
	private String content;
	
	@ManyToOne
	@JoinColumn(name="FK_AUTHOR_USER")
	private User author;
	
	@Column(name="DATE")
	private LocalDateTime date;

	public Post() {}
	
	public Post(String content, User author, LocalDateTime date) {
		super();
		this.content = content;
		this.author = author;
		this.date = date;
	}

	public Post(int id, String content, User author, LocalDateTime date) {
		super();
		this.id = id;
		this.content = content;
		this.author = author;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	

}
