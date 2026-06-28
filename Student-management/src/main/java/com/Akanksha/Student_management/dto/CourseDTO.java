package com.Akanksha.Student_management.dto;

public class CourseDTO {
	 private int id;
	    private String courseName;
	    private String description;

	    public CourseDTO(int id, String courseName, String description) {
	        this.id = id;
	        this.courseName = courseName;
	        this.description = description;
	    }

	    public int getId() { 
	    		return id; 
	    }
	    public void setId(int id) { 
	    		this.id = id; 
	    }

	    public String getCourseName() { 
	    		return courseName; 
	    }
	    public void setCourseName(String courseName) { 
	    		this.courseName = courseName; 
	    }

	    public String getDescription() { 
	    		return description; 
	    }
	    public void setDescription(String description) { 
	    		this.description = description; 
	    }
}
