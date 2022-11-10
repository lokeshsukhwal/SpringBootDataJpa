package com.app.lokesh.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.lokesh.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
