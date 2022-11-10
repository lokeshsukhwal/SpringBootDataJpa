package com.app.lokesh.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Course;
import com.app.lokesh.entity.Student;
import com.app.lokesh.repository.CourseRepository;
import com.app.lokesh.repository.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository sRepository;
	@Autowired
	private CourseRepository cRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course(1010,"SBMS",10000.0);
		Course c2 = new Course(1011,"UI",7000.0);
		Course c3 = new Course(1012,"CLOUD",5500.0);
		cRepository.save(c1);
		cRepository.save(c2);
		cRepository.save(c3);
		
		Student s1 = new Student(1203,"lokesh","ls@gmail.com",List.of(c1,c2));
		Student s2 = new Student(1204,"mukesh","ms@gmail.com",List.of(c3));
		sRepository.save(s1);
		sRepository.save(s2);
		
	}
}
