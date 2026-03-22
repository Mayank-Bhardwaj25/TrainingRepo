package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.entities.Student;
import com.coforge.services.StudentService;

@Controller
@ResponseBody
public class StudentController {
	@Autowired
	StudentService service;

	@RequestMapping("/student")
	public ModelAndView getAll() {
		List<Student> slist = service.getAll();
		
		 ModelAndView mv = new ModelAndView("list");
		 mv.addObject("slist",slist );
		 
		 return mv;
	}
	@RequestMapping("/student/add")
	public ModelAndView addStudent() {
		return new ModelAndView("add");
	}
	
	@RequestMapping(value="/student",method=RequestMethod.POST)
	public String save(@ModelAttribute Student student) {
		String s=service.save(student);
		return s;
	}
	
	@RequestMapping("/student")
	public ModelAndView getById(@RequestParam("sid")long sid) {
		Student s=service.getById(sid);
		ModelAndView mv=new ModelAndView("get");
		mv.addObject("student",s);
		return mv;
	}
	
	@RequestMapping(value = "/student",method = RequestMethod.PUT)
	public String update(@ModelAttribute Student student) {
		String s=service.update(student);
		return s;
	}
	
	@RequestMapping(value = "/student",method = RequestMethod.DELETE)
	public String update(@RequestParam("sid")long sid) {
		String s=service.delete(sid);
		return s;
	}
	
}
