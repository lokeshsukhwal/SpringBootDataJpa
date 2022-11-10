package com.app.lokesh.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.lokesh.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

}
