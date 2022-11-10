package com.app.lokesh.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Employee;
import com.app.lokesh.repository.EmployeeRepository;

@Component
public class EmployeeSaveRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository eRepository;

	@Override
	public void run(String... args) throws Exception {
		eRepository.saveAll(
				List.of( new Employee(10,"lokesh",75000.0,"Dev"),
						 new Employee(11,"ram",55000.0,"qa"),
						 new Employee(12,"shivani",59000.0,"prod"),
						 new Employee(13,"deshraj",67000.0,"qa"),
						 new Employee(14,"rubi",62000.0,"Dev"),
						 new Employee(15,"deva",55000.0,"Dev")
						)
				);
//		eRepository.getAllEmpNames()
//		eRepository.getEmployees()
		/*eRepository.getEmpNameAndDept()
		.stream().map(obj->obj[0] +" : "+obj[1])*/
//		.forEach(System.out::println);
		
		  Optional<String> data = eRepository.getEmpNameById(12); 
		  if (data.isPresent()) { 
		  System.out.println(data.get()); 
		  } else {
		  System.out.println("DATA NOT FOUND "); 
		  }
		 
		Employee employee = eRepository.fatchEmployeeById(15)
				.orElseThrow(()-> new RuntimeException("Data Not Found"));
		System.out.println(employee);
	}
}
