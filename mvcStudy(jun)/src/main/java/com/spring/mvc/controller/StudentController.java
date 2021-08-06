package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dao.StudentDAO;
import com.spring.mvc.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentDAO studentDAO;
	
	@RequestMapping(value = "/student/index", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/student/index");
		mav.addObject("student", new Student());
		return mav;
	}
	
	@RequestMapping(value = "/student/addStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute Student student) {
		ModelAndView mav = new ModelAndView();
		
		//DB Insert
		studentDAO.insert(student);
		
		mav.setViewName("/student/addStudent");
		mav.addObject("student", student);
		return mav;
	}
	

}





