package com.coforge.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.coforge.entities.Student;
@Component
public class StudentDAO implements StudentDaoInterface
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> getAll() {
		 String query = "select * from student";
			RowMapper<Student> rowMapper = (rs, rowNum) -> {
				Student s = new Student();
				
				  s.setSid(rs.getLong("sid"));
			      s.setSname(rs.getString("sname"));
			      s.setCourse(rs.getString("course"));
			      s.setAddress(rs.getString("address"));
				return s;
				
			};
			 return jdbcTemplate.query(query, rowMapper);
	}

	@Override
	public String save(Student student) {
		String query = "insert into student (sname,course,address) values(?,?,?)";
		jdbcTemplate.update(query, student.getSid(), student.getSname(), student.getCourse(), student.getAddress());
		return "row inserted";
		
	}

	@Override
	public Student getById(long sid) {
		String query = "select * from student where sid = ?";
		RowMapper<Student> rowMapper = (rs,rowNum) -> {
			Student s = new Student();
			s.setSid(rs.getLong("sid"));
			s.setSname(rs.getString("sname"));
			s.setCourse(rs.getString("course"));
			s.setAddress(rs.getString("address"));
			return s;
			
		};
		return jdbcTemplate.queryForObject(query, rowMapper, sid);
	}
	
	@Override
	public String update(Student student) {
		// TODO Auto-generated method stub
		String query="update student set sname=?,course=?,address=? where sid=?";
		jdbcTemplate.update(query,student.getSname(),student.getCourse(),student.getAddress(),student.getSid());
		return "row updated";
	}

	@Override
	public String delete(long sid) {
		// TODO Auto-generated method stub
		String query="delete from student where sid=?";
		Student student=new Student();
		jdbcTemplate.update(query,student.getSid());
		return "row deleted";
	}
	
	

}
