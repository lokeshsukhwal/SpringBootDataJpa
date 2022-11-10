package com.app.lokesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.lokesh.entity.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {

}
