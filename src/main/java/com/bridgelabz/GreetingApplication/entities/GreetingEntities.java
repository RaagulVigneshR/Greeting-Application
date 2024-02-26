package com.bridgelabz.GreetingApplication.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GreetingEntities {
	@Id
	private long id;
	private String name;
	private String message;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public GreetingEntities(long id, String name, String message) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
	}
	public GreetingEntities() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
