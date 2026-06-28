package com.Akanksha.Student_management.dto;

import java.util.List;

public class StudentDTO {
	private int id;
    private String name;
    private String email;
    private String phone;
    private List<CourseDTO> courses;

    public StudentDTO(int id, String name, String email, String phone, List<CourseDTO> courses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.courses = courses;
    }

    public int getId() { 
    		return id; 
    	}
    public void setId(int id) { 
    		this.id = id; 
    	}

    public String getName() { 
    		return name;
    	}
    public void setName(String name) { 
    		this.name = name;
    	}
  

    public String getEmail() {
    		return email;
    	}
    public void setEmail(String email) { 
    		this.email = email;
    	}

    public String getPhone() { 
    		return phone; 
    	}
    public void setPhone(String phone) { 
    		this.phone = phone;
    	}

    public List<CourseDTO> getCourses() { 
    		return courses;
    	}
    public void setCourses(List<CourseDTO> courses) {
    		this.courses = courses;
    	}
}
