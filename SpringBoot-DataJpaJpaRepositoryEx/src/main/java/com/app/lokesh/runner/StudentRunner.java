package com.app.lokesh.runner;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Student;
import com.app.lokesh.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository sRepository;

	@Override
	public void run(String... args) throws Exception {
		// to customize date format using SDF
		/*
		 * SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/M/yyyy"); 
		 * String date = simpleDateFormat.format(new Date()); 
		 * System.out.println(date);
		 */
		
		Student student = new Student();
		student.setSname("lokesh");
		student.setSfee(10000.0);
		student.setSdoj(new Date());
		sRepository.save(student);
		
		//to fetch all the records from database
		
	List<Student> dataList = sRepository.findAll();
	System.out.println(dataList.getClass().getName());
	dataList.forEach(System.out::println);
	
//-=-=-=-=-=-=-=--=-=-=-=-=-=-=-- it's best suitable for searching =-=-=-=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-=-=-
	//Example(I)
	Example<Student> sdataExample = Example.of(student);
	sRepository.findAll(sdataExample).forEach(System.out::println);
		
	}
}
