package com.app.lokesh.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "prodtab")
public class Product {
	@Id
	@Column(name = "pid")
	private int pid;
	@Column(name = "pcode")
	private String pcode;
	
	@ElementCollection
	@CollectionTable(
			name = "product_colors",
			joinColumns = @JoinColumn(name = "pidFK")
			)
	@Column(name = "data")
	List<String> colors;
	
	@ElementCollection
	@CollectionTable(
			name = "product_models",
			joinColumns = @JoinColumn(name="pidFK")
			)
	@Column(name = "model")
	Set<String> model;
	
	@ElementCollection
	@CollectionTable(
			name = "product_details",
			joinColumns = @JoinColumn(name="pidFK")
			)
	@MapKeyColumn(name = "code")
	@Column(name = "detail")
	Map<String, String> details;	
	
	
}
