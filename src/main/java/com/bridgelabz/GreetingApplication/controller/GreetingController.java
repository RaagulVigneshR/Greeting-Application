package com.bridgelabz.GreetingApplication.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.bridgelabz.GreetingApplication.entities.GreetingEntities;
import com.bridgelabz.GreetingApplication.service.MyService;
@RestController
public class GreetingController {
	@Autowired
	private MyService service;
	
	@GetMapping("/greetings")
	public List<GreetingEntities> getGreetings(){
		return this.service.getGreetings();		
	}
	
	@GetMapping("/getgreetings/{greetingId}")
	public GreetingEntities getGreeting(@PathVariable String greetingId) {
		return this.service.getGreeting(Long.parseLong(greetingId));
		
	}
	
	@PostMapping("/postgreetings")
	public ResponseEntity<String> postGreetings(@RequestBody GreetingEntities msg){
		try{
			this.service.addGreeting(msg);
			String responseBody = "Response from POST request : Has be Added successfully";
			return new ResponseEntity<>(responseBody,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/putgreetings")
	public ResponseEntity<String> updateGreetings(@RequestBody GreetingEntities msg){
		try{
			this.service.putGreeting(msg);
			String responseBody = "Response from PUT request for MSG: Altered successfully";
			
			return new ResponseEntity<>(responseBody,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/deletegreetings/{greetingId}")
	public ResponseEntity<String> deleteGreetings(@PathVariable String greetingId){
		try{
			this.service.deleteGreeting(Long.parseLong(greetingId));
			String responseBody = "Response from Delete request for ID: " + greetingId + " Has been removed successfully";
			return new ResponseEntity<>(responseBody,HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
