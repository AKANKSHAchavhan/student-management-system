package com.Akanksha.Student_management.service;

import java.util.List;

import com.Akanksha.Student_management.entity.Course;

public interface CourseService {
	Course saveCourse(Course course);
	
	List<Course> getAllCourse();
	
	Course getCourseById(int id);
	
	Course updateCourse(int id, Course course);
	
	void deleteCourse(int id);
}
