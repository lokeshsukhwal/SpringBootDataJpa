package com.app.lokesh.runner;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.Repository.ProductRepository;
import com.app.lokesh.entity.Product;

@Component
public class ProductRunnner implements CommandLineRunner {
	@Autowired
	private ProductRepository pRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
		product.setPid(10);
		product.setPcode("PEN");
		
		product.setColors(List.of("RED","GREEN","BLUE"));
		
		Set<String> set = new LinkedHashSet<>();
		set.add("M1");
		set.add("LA");
		set.add("SF");
		
		product.setModel(set);
		
		Map<String, String> map = new LinkedHashMap<>();
		map.put("D1", "ABC");
		map.put("D2", "XYZ");
		
		product.setDetails(map);
		
		pRepository.save(product);
		
		
	}
}
