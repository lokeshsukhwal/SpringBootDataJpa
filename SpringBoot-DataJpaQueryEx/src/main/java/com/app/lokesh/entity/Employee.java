package com.app.lokesh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empDept;
}
