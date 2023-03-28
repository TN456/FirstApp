package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;

@RestController
public class StudentController {

	@GetMapping("/detail")
	public Student getStudent() {
		Student student = new Student();
		student.setUSN("1mj18cs154");
		student.setName("Tanuja N");
		student.setPhonenumber("7327492849");
		student.setAge(23);
		return student;
	}
	
	@GetMapping("/details")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		students.add(new Student());
		return students;
	}
	
	@GetMapping("/{USN}/{name}/{phonenumber}/{age}")
	public Student getStudentByPathVariable(
			@PathVariable("USN") String USN,
			@PathVariable("name") String name,
			@PathVariable("phonenumber") String phonenumber,
			@PathVariable("age") int age){
		return new Student();
	}
	
	@GetMapping("/student/query")
	public Student getStudentByRequestParam(
			@RequestParam(name="USN") String USN,
			@RequestParam(name="name") String name,
			@RequestParam(name="phonenumber") String phonenumber,
			@RequestParam(name="age") int age) {
		return new Student();
	}
}
