package com.Akanksha.Student_management;

import java.util.List;

public interface StudentService {
	
	Student saveStudent(Student student);
	
	List<StudentDTO> getAllStudents();
	
	StudentDTO getStudentById(int id);
	
	void deleteStudent(int id);
	
	Student updateStudent(int id, Student student);
}
