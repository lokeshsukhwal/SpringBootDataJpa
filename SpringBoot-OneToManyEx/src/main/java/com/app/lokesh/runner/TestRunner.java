package com.app.lokesh.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Classroom;
import com.app.lokesh.entity.Student;
import com.app.lokesh.repository.ClassroomRepository;
import com.app.lokesh.repository.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository sRepository;
	@Autowired
	private ClassroomRepository cRepository;

	@Override
	public void run(String... args) throws Exception {

		Student s1 = new Student(101, "lokesh", 10000.0);
		Student s2 = new Student(102, "rubi", 5000.0);
		Student s3 = new Student(103, "raju", 2500.0);
		Student s4 = new Student(104, "laxman", 500.0);

		sRepository.save(s1);
		sRepository.save(s2);
		sRepository.save(s3);
		sRepository.save(s4);

		Classroom classroom = new Classroom(10012, "lacture-1", List.of(s1, s2, s3, s4));
		cRepository.save(classroom);
	}
}
