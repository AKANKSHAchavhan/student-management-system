package com.Akanksha.Student_management;

import java.util.List;

public interface CourseService {
	Course saveCourse(Course course);
	
	List<Course> getAllCourse();
	
	Course getCourseById(int id);
	
	Course updateCourse(int id, Course course);
	
	void deleteCourse(int id);
}
