package com.Akanksha.Student_management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Akanksha.Student_management.dto.StudentDTO;
import com.Akanksha.Student_management.entity.Student;
import com.Akanksha.Student_management.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	private StudentService service;
	
	public StudentController(StudentService service) {
		this.service=service;
	}
	
	//CREATE STUDENT
	@PostMapping
	public Student save(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	//GET ALL STUDENTS
	@GetMapping
	public List<StudentDTO> getAll(){
		return service.getAllStudents();
	}
	
	//GET STUDENT BY ID
	@GetMapping("/{id}")
	public StudentDTO ById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	//DELETE STUDENT
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		service.deleteStudent(id);
		return"Student deleted successfully";
	}

	@PutMapping("/{id}")
	public Student update(@PathVariable int id, @RequestBody Student student) {
	    return service.updateStudent(id, student);
	}

}
