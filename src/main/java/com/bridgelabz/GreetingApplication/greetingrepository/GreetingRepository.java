package com.bridgelabz.GreetingApplication.greetingrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.GreetingApplication.entities.GreetingEntities;

public interface GreetingRepository extends JpaRepository<GreetingEntities , Long>{
	

}
