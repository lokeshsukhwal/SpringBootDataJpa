package com.app.lokesh.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	

}
