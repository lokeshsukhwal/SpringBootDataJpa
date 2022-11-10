package com.app.lokesh.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Employee;
import com.app.lokesh.repository.EmployeeRepository;

@Component
public class EmployeeAInsesrtRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository eRepository;

	@Override
	public void run(String... args) throws Exception {
		eRepository.saveAll(
				List.of(new Employee(1,"lokesh",75000.0,"dev"),
						new Employee(2,"ram",67000.0,"dev"),
						new Employee(3,"shivani",45000.0,"qa"),
						new Employee(4,"mukesh",55000.0,"prod"),
						new Employee(5,"rubi",67000.0,"qa"),
						new Employee(6,"yogi",65000.0,"prod"),
						new Employee(5,"rubi",55000.0,"qa")
						)
				);
	}
}
