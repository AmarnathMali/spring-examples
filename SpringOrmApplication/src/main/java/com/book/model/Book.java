package com.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "book_table")
@DynamicUpdate

public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int id;
	@Column(name= "Book_Name")
	private String bname;
	@Column(name= "Author_Name")
	private String aname;
	@Column(name= "Book_Price")
	private String price;
	
	
	public Book() {
		super();
	}


	public Book(String bname, String aname, String price) {
		super();
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}


	public Book(int id, String bname, String aname, String price) {
		super();
		this.id = id;
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getAname() {
		return aname;
	}


	public void setAname(String aname) {
		this.aname = aname;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
