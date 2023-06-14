package com.spring.rest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Borrower {

	@Id
	private Long id;
	private String name;
	private String date_of_birth;
	private String date_of_membership;
	private int books_borrowed;
	
	public Borrower(Long id, String name, String date_of_birth, String date_of_membership, int books_borrowed) {
		super();
		this.id = id;
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.date_of_membership = date_of_membership;
		this.books_borrowed = books_borrowed;
	}

	public Borrower() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getDate_of_membership() {
		return date_of_membership;
	}

	public void setDate_of_membership(String date_of_membership) {
		this.date_of_membership = date_of_membership;
	}

	public int getBooks_borrowed() {
		return books_borrowed;
	}

	public void setBooks_borrowed(int books_borrowed) {
		this.books_borrowed = books_borrowed;
	}
	
	
	
	
}
