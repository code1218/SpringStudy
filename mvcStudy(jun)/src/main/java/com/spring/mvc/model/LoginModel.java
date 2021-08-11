package com.spring.mvc.model;

public class LoginModel {
	private String login_id;
	private String login_pwd;
	private String login_flag;
	private String submit_flag;
	
	public LoginModel() {
		// TODO Auto-generated constructor stub
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getLogin_pwd() {
		return login_pwd;
	}

	public void setLogin_pwd(String login_pwd) {
		this.login_pwd = login_pwd;
	}

	public String getLogin_flag() {
		return login_flag;
	}

	public void setLogin_flag(String login_flag) {
		this.login_flag = login_flag;
	}

	public String getSubmit_flag() {
		return submit_flag;
	}

	public void setSubmit_flag(String submit_flag) {
		this.submit_flag = submit_flag;
	}
	
	
}
