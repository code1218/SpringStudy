package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dao.JoinDAO;
import com.spring.mvc.model.beans.JoinBean;

@Controller
public class JoinController {
	
	@Autowired
	private JoinDAO joinDAO;
	
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public ModelAndView join() {
		return new ModelAndView("/join/join");
	}
	
	@RequestMapping(value="/joinIdCheck", method = RequestMethod.GET)
	public ModelAndView joinIdCheck(@RequestParam("join_id")String id) {
		ModelAndView mav = new ModelAndView("/join/join");
		boolean flag = joinDAO.joinIdCheck(id) == 1 ? true : false;
		mav.addObject("join_id", id);
		mav.addObject("idCheck_flag", flag);
		return mav;
	}
	
	@RequestMapping(value="/joinInsert", method = RequestMethod.POST)
	public ModelAndView joinInsert(JoinBean bean) {
		int statusCount = joinDAO.joinInsert(bean);
		System.out.println("insert 건수: " + statusCount);
		return new ModelAndView("/index");
	}
}
