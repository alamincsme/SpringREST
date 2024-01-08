package com.alamincse.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alamincse.main.model.Student;
import com.alamincse.main.repository.CourseRepository;
import com.alamincse.main.repository.StudentRepository;

@RestController
public class MainController {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CourseRepository courseRepository;
	
	
	@GetMapping("/")
	public String testController() {
		return "Hello, Spring Boot Developer";
	}
	
	
	@GetMapping("/student/all")
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	

}
