package com.bridgelabz.GreetingApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.GreetingApplication.entities.GreetingEntities;
import com.bridgelabz.GreetingApplication.greetingrepository.GreetingRepository;
@Service
public class ServiceImpl implements MyService {

	@Autowired
	private GreetingRepository greetingRepository;
	@Override
	public List<GreetingEntities> getGreetings() {
		// TODO Auto-generated method stub
		return greetingRepository.findAll();
	}

	@Override
	public GreetingEntities getGreeting(long id) {
		// TODO Auto-generated method stub
		return greetingRepository.findById(id).get();
	}

	@Override
	public void addGreeting(GreetingEntities msg) {
		// TODO Auto-generated method stub
		
		 greetingRepository.save(msg);
	}

	@Override
	public void putGreeting(GreetingEntities msg) {
		// TODO Auto-generated method stub
		 greetingRepository.save(msg);
	}

	@Override
	public void deleteGreeting(long id) {
		// TODO Auto-generated method stub
		greetingRepository.deleteById(id);
	}
	

}
