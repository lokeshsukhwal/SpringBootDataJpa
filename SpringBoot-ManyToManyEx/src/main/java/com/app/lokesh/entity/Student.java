package com.app.lokesh.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
	@Id
	private Integer sId;
	private String sName;
	private String sMail;
	
	@ManyToMany
	@JoinTable(name = "corstu",
	           joinColumns = @JoinColumn(name="corFK"),
	           inverseJoinColumns = @JoinColumn(name="sidFK")
	)
	private List<Course> course; //HAS-A
	
}
