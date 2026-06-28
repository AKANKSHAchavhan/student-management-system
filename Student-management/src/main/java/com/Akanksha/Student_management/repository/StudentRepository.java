package com.Akanksha.Student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Akanksha.Student_management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
