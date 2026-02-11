package com.interview.project.StudentManagementProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("students", service.getAllStudents());
		return "index";
	}
	
	@GetMapping("/register")
	public String showregisterForm(Model model) {
		model.addAttribute("student", new Student());
		return "register";
	}
	
	@PostMapping("/register")
	public String registerStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) {
		model.addAttribute("student", service.getStudentByIDStudent(id));
		return "edit";
	}
	@PostMapping("/update")
	public String update(@ModelAttribute Student student) {
		service.saveStudent(student);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		service.deleteStudent(id);
		return "redirect:/"; 
	}

}
