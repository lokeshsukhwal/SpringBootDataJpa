package com.app.lokesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}
