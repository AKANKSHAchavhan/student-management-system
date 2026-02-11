package com.interview.project.StudentManagementProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
	public Student getStudentByIDStudent(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public void deleteStudent(Long id) {
		repo.deleteById(id);
	}
}
