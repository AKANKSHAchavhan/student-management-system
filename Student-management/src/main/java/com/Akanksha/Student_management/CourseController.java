package com.Akanksha.Student_management;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	private CourseService service;
	
	public CourseController(CourseService service) {
		this.service=service;
	}
	
	//CREATE COURSE
	@PostMapping
	public Course save(@RequestBody Course course) {
		return service.saveCourse(course);
	}
	
	//GET ALL COURSES
	@GetMapping
	public List<Course> getAll(){
		return service.getAllCourse();
	}
	
	//GET COURSE BY ID
	@GetMapping("/{id}")
	public Course getById(@PathVariable int id) {
		return service.getCourseById(id);
	}
	
	@PutMapping("/{id}")
	public Course update(@PathVariable int id, @RequestBody Course course) {
		
		return service.updateCourse(id, course);
	}
	
	//DELETE COURSE
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		service.deleteCourse(id);
		return "Course deleted successfully";
	}
	
}
