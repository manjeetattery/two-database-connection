package com.example.model2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Book {

	@Id
	private Long id;
	private String name;
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
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
	public Book(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
