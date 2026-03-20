package com.coforge.services;

import java.util.List;

import com.coforge.entities.Student;


public interface StudentServiceInterace {

	public List<Student> getAllStudents();
	public Student saveStudent(Student student);
	public Student updateStudent(Student student, long id);
	public Student getStudentById(long id);
	public void deleteStudent(long id);
}
