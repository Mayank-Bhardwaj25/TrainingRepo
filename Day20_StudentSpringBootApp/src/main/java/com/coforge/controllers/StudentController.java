package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Student;
import com.coforge.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>>  getAllStudents() {
		
		return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> saveCustomer(@RequestBody Student student) {
		return new ResponseEntity<>(service.saveStudent(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/student/{sid}")
	public ResponseEntity<Student> getStudentById( @PathVariable("sid") long sid) {
		return new ResponseEntity<>(service.getStudentById(sid), HttpStatus.OK);
	}
	
	@PutMapping("/student/{sid}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("sid") long id) {
		return new ResponseEntity<>(service.updateStudent(student, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/student/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") long id) {
		
		service.deleteStudent(id);
		 return new ResponseEntity<>("Student deleted successully", HttpStatus.OK);
	}
}


