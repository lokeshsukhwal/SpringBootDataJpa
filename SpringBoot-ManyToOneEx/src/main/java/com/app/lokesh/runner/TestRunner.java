package com.app.lokesh.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Department;
import com.app.lokesh.entity.Employee;
import com.app.lokesh.repository.DepartmentRepository;
import com.app.lokesh.repository.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	private EmployeeRepository eRepository;
	@Autowired
	private DepartmentRepository dRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Department deptDepartment = new Department(10010,"DEV");
		dRepository.save(deptDepartment);
		
		eRepository.saveAll(
				List.of(
						new Employee(101, "LOKESH", 75000.0, deptDepartment),
						new Employee(102, "MUKESH", 25000.0, deptDepartment),
						new Employee(103, "RUBI", 45000.0, deptDepartment),
						new Employee(104, "RAJU", 75200.0, deptDepartment)
						)
				);
		
	}
}
