package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.daos.StudentDAO;
import com.coforge.entities.Student;

@Service
public class StudentService implements StudentServiceInterface {

	@Autowired
	private StudentDAO dao;
	
	@Override
	public List<Student> getAll() {
		
		return dao.getAll() ;
	}

	@Override
	public String save(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

	@Override
	public Student getById(long sid) {
		// TODO Auto-generated method stub
		return dao.getById(sid);
	}

	@Override
	public String update(Student student) {
		// TODO Auto-generated method stub
		return dao.update(student);
	}

	@Override
	public String delete(long sid) {
		// TODO Auto-generated method stub
		return dao.delete(sid);
	}
}
