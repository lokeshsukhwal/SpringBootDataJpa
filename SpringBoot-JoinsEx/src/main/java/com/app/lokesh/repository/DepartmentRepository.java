package com.app.lokesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
