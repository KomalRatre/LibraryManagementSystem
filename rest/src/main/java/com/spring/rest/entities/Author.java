package com.spring.rest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Author {
	@Id
	private Long id;
	
	private String name;
	
	private String date_of_birth;
	private String date_of_death;
	
	public Author(Long id,String name, String date_of_birth, String date_of_death) {
		super();
		this.id = id;
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.date_of_death = date_of_death;
	}

	public Author() {
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

	public String getDate_of_death() {
		return date_of_death;
	}

	public void setDate_of_death(String date_of_death) {
		this.date_of_death = date_of_death;
	}
	
	
}
