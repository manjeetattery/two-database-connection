package com.example.model1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class User {
	@Id
	private Long id;
	private String userName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]";
	}

	public User(Long id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
