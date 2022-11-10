package com.app.lokesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.lokesh.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query("SELECT e.empName,dept.deptName e FROM Employee Inner Join WHERE emp.department as department ")
	List<Object[]> getEmpNameandDeptName();
}
