package com.app.lokesh.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.lokesh.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
