package com.interview.project.StudentManagementProject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{
	Student findByEmail(String email);
}
