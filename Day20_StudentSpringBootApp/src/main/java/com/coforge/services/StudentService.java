package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.daos.StudentDAO;
import com.coforge.entities.Student;
import com.coforge.exceptions.StudentNotFoundException;

@Service
public class StudentService implements StudentServiceInterace {

	@Autowired
	private StudentDAO dao;
	@Override
	public List<Student> getAllStudents() {
		
		return dao.getAllStudents();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return dao.saveStudent(student);
	}

	
	@Override
	public Student updateStudent(Student student, long id) {
		
		Student exStudent = dao.getStudentById(id).orElseThrow(() -> new StudentNotFoundException("No Student Found with this id" +id));
		exStudent.setSname(student.getSname());
		exStudent.setCourse(student.getCourse());
		exStudent.setAddress(student.getAddress());
		return dao.saveStudent(exStudent);
		
	}

	@Override
	public Student getStudentById(long id) {
		
		return dao.getStudentById(id).orElseThrow(() -> new StudentNotFoundException("No Student Found with this id" +id));
	}

	@Override
	public void deleteStudent(long id) {
		Student exStudent = dao.getStudentById(id).orElseThrow(() -> new StudentNotFoundException("No Customer Found with this id" +id));
		
		dao.deleteStudent(id);
       System.out.println("Student deleted");
		
	}

}
