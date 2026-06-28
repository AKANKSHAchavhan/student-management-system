package com.Akanksha.Student_management;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;
    private final CourseRepository courseRepo;

    public StudentServiceImpl(StudentRepository repo, CourseRepository courseRepo) {
        this.repo = repo;
        this.courseRepo = courseRepo;
    }

    // Save student with full course objects
    @Override
    public Student saveStudent(Student student) {
        
    	student.setCourses(getCoursesFromDatabase(student.getCourses()));
        return repo.save(student);
    }

    // Get all students as DTOs
    @Override
    public List<StudentDTO> getAllStudents() {
        List<StudentDTO> dtoList = new ArrayList<>();
        for (Student s : repo.findAll()) {
            dtoList.add(convertToDTO(s));
        }
        return dtoList;
    }

    // Get single student by ID as DTO
    @Override
    public StudentDTO getStudentById(int id) {
        Student student = repo.findById(id).orElseThrow(()->new RuntimeException("Student not found"));
        
        return convertToDTO(student);
    }

    // Delete student by ID
    @Override
    public void deleteStudent(int id) {
        repo.deleteById(id);
    }

    // Convert entity to DTO
    private StudentDTO convertToDTO(Student student) {
        List<CourseDTO> courses = new ArrayList<>();
        if (student.getCourses() != null) {
            for (Course c : student.getCourses()) {
                courses.add(new CourseDTO(c.getId(), c.getCourseName(), c.getDescription()));
            }
        }
        return new StudentDTO(student.getId(), student.getName(), student.getEmail(),
                              student.getPhone(), courses);
    }
    
    //Update Student
    @Override
    public Student updateStudent(int id, Student newData) {

        Student old = repo.findById(id)
                          .orElseThrow(() -> new RuntimeException("Student not found"));

        old.setName(newData.getName());
        old.setEmail(newData.getEmail());
        old.setPhone(newData.getPhone());

        // ---- IMPORTANT: Fetch full Course objects from DB ----
        List<Course> updatedCourses = new ArrayList<>();

        if (newData.getCourses() != null) {
            for (Course c : newData.getCourses()) {
                Course dbCourse = courseRepo.findById(c.getId()).orElse(null);
                if (dbCourse != null) {
                    updatedCourses.add(dbCourse);
                }
            }
        }

        old.setCourses(updatedCourses);

        return repo.save(old);
    }

    private List<Course> getCoursesFromDatabase(List<Course> courses){
    	
    		List<Course> result = new ArrayList<Course>();
    		
    		if(courses !=null) {
    			for (Course c: courses) {
    				
    				Course dbCourse = courseRepo.findById(c.getId()).orElseThrow(()-> new RuntimeException("Course not found: " + c.getId()));
    					result.add(dbCourse);
    			}
    		}
    		return result;
    }
}
