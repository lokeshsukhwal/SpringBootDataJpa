package com.app.lokesh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.lokesh.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	/***
	 * @Query("---------------")
	 * ReturnType abstractMethodName(<param>)
	 */
	
	// SQL : 1. SQL : fetch one column data	
	  @Query("SELECT e.empName FROM Employee e") 
	  List<String> getAllEmpNames();
	 
	
	// SQL : 2. SQL : fetch all column data 
	  @Query("select e from Employee e") 
	  List<Employee> getEmployees();
	 
	
	
	 // SQL : 3. SQL : fetch multiple column data
	  @Query("select e.empName,e.empDept from Employee e")
	  List<Object[]> getEmpNameAndDept();
	 
	
	
    // SQL : 4. SQL : fetch one column and one row data
	  @Query("SELECT e.empName FROM Employee e WHERE e.empId=:id")
	  Optional<String> getEmpNameById(Integer id);
	  
    // SQL : 5. SQL : fetch all column and one row data
	  @Query("SELECT e FROM Employee e WHERE e.empId=:id")
	  Optional<Employee> fatchEmployeeById(Integer id);
	 
	
	
	
	
}
