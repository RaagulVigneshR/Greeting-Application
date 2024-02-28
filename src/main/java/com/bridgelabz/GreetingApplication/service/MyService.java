package com.bridgelabz.GreetingApplication.service;
import com.bridgelabz.GreetingApplication.entities.GreetingEntities;
import java.util.*;

public interface MyService {
	public List<GreetingEntities> getGreetings();
	public GreetingEntities getGreeting(long id);
	public void addGreeting(GreetingEntities msg);
	public void putGreeting(GreetingEntities msg);
	public void deleteGreeting(long id);
	/*
	 * - save greetings
	 * - get greetings
	 * - get all greeting
	 * - delete greetings by id
	 */

}
