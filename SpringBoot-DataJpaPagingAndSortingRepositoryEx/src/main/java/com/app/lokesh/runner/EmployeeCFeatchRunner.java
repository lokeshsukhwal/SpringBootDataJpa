package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Employee;
import com.app.lokesh.repository.EmployeeRepository;

@Component
public class EmployeeCFeatchRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository eRepository;

	@Override
	public void run(String... args) throws Exception {
		// [INPUT]
		Pageable pageable = PageRequest.of(1, 2);
		// [OUTPUT]
		Page<Employee> data = eRepository.findAll(pageable);
		// [RESULT]
		data.getContent().forEach(System.out::println);
		
		// [METADATA]
		System.out.println(data.isFirst());
		System.out.println(data.isLast());
		System.out.println(data.isEmpty());
		System.out.println(data.hasNext());
		System.out.println(data.hasPrevious());
		System.out.println(data.hasContent());
		System.out.println(data.getSize());

	}

}
