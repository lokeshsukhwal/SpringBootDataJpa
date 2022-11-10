package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Student;
import com.app.lokesh.repository.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(studentRepository.getClass().getName());
		
		Student student = new Student();
		student.setSid(101);
		student.setSname("lokesh");
		student.setSfee(10000.0);
		
		studentRepository.save(student);//Insert/Update
	}

}
