package com.bridgelabz.GreetingApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.GreetingApplication.entities.GreetingEntities;

public interface GreetingDao extends JpaRepository<GreetingEntities , Long>{
	

}
