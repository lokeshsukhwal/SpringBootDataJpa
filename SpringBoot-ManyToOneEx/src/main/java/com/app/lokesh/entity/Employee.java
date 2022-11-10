package com.app.lokesh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Integer eId;
	private String eName;
	private Double eSalary;
	
	//HAS-A
	@ManyToOne
	@JoinColumn(name = "deptFK") //FK
	private Department department;
}
