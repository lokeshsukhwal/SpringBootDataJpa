package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Car;
import com.app.lokesh.entity.Engine;
import com.app.lokesh.repository.CarRepository;
import com.app.lokesh.repository.EngineRepository;

@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	private CarRepository cRepository;
	@Autowired
	private EngineRepository eRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Engine e1 = new Engine(4520,8745123,"DIESEL");
		eRepository.save(e1);
		
		Car c1 = new Car(5421,"Mahindra-XUV",2700000.0,e1);
		cRepository.save(c1);
	}
}
