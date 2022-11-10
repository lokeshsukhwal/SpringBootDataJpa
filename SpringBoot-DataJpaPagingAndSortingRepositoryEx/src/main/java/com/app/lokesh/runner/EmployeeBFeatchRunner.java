package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Employee;
import com.app.lokesh.repository.EmployeeRepository;

//@Component
public class EmployeeBFeatchRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository eRepository;

	@Override
	public void run(String... args) throws Exception {
		Iterable<Employee> data = eRepository.findAll();
		data.forEach(System.out::println);
		/*
		 * Traditional method
		 * for (Employee employee : data) { System.out.println(employee); }
		 */
		
//		------ case*1 ------ 1*column --------ASC order --------------
		Iterable<Employee> data1 = eRepository.findAll(Sort.by(Direction.ASC,"esal")); //[order by ASC]
		data.forEach(System.out::println);
		
//		------ case*1 ------ 1*column --------DESC order --------------
		Iterable<Employee> data2 = eRepository.findAll(Sort.by(Direction.DESC,"esal")); //[order by DESC]
		data.forEach(System.out::println);
		
//		------ case*1 ------ N column --------Both same order --------------
		Iterable<Employee> data3 = eRepository.findAll(Sort.by("esal","edept")); //[both are ASC]
		data.forEach(System.out::println);
		
//		------ case*1 ------ N column --------Both same order --------------
		Iterable<Employee> data4 = eRepository.findAll(Sort.by(Direction.DESC,"esal","edept")); //[both are DESC]
		data.forEach(System.out::println);
		
//		------ case*1 ------ N column --------Both are having different order --------------
		Iterable<Employee> data5 = eRepository.findAll(Sort.by(Order.asc("esal"),Order.desc("edept"))); //[both are DESC]
		data.forEach(System.out::println);
		
		
	}
}
