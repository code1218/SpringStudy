package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dao.study.LoginDAO;
import com.spring.mvc.model.LoginModel;
import com.spring.mvc.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private LoginDAO loginDAO;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginIndex() {
		ModelAndView mav = new ModelAndView("/login/login");
		
		LoginModel loginmodel = loginService.getLoginModel();
		mav.addObject("loginmodel", loginmodel);
		return mav;
	}
	
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public ModelAndView loginCheck(LoginModel loginModel) {
		int flag = loginDAO.loginCheck(loginModel);
		if(flag == 1) {
			ModelAndView mavLoginSuccess = new ModelAndView("/login/index");
			return mavLoginSuccess;
		}else {
			ModelAndView mavLoginFailure = new ModelAndView("/login/login");
			return mavLoginFailure;
		}
	}
}
