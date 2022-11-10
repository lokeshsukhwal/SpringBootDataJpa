package com.app.lokesh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Student {
	@Id
	private Integer sid;
	private String sname;
	private Double sfee;
}
