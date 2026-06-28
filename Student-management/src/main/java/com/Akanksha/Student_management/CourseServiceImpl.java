package com.Akanksha.Student_management;

import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class CourseServiceImpl implements CourseService{

	private CourseRepository repo;
	
	public CourseServiceImpl(CourseRepository repo) {
		this.repo=repo;
	}
	@Override
	public Course saveCourse(Course course) {
		return repo.save(course);
	}

	@Override
	public List<Course> getAllCourse() {
		return repo.findAll();
	}

	@Override
	public Course getCourseById(int id) {
		return repo.findById(id).orElseThrow(()-> new RuntimeException("Course not found"));
		
	}

	@Override
	public Course updateCourse(int id, Course newCourse) {

	    Course oldCourse = repo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Course not found"));

	    oldCourse.setCourseName(newCourse.getCourseName());
	    oldCourse.setDescription(newCourse.getDescription());

	    return repo.save(oldCourse);
	}
	
	@Override
	public void deleteCourse(int id) {
		repo.deleteById(id);
	}
	
}
