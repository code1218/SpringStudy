package com.spring.mvc.service;

import org.springframework.stereotype.Service;

import com.spring.mvc.model.LoginModel;

@Service
public class LoginService {
	
	public LoginModel getLoginModel() {
		LoginModel loginModel = new LoginModel();
		loginModel.setLogin_id("");
		loginModel.setLogin_pwd("");
		loginModel.setLogin_flag("3");
		loginModel.setSubmit_flag("false");
		return loginModel;
	}
}
