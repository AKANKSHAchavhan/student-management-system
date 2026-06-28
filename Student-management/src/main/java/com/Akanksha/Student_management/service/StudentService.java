package com.Akanksha.Student_management.service;

import java.util.List;

import com.Akanksha.Student_management.dto.StudentDTO;
import com.Akanksha.Student_management.entity.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	
	List<StudentDTO> getAllStudents();
	
	StudentDTO getStudentById(int id);
	
	void deleteStudent(int id);
	
	Student updateStudent(int id, Student student);
}
