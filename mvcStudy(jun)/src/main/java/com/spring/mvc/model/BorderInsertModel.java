package com.spring.mvc.model;

import org.springframework.web.multipart.MultipartFile;

public class BorderInsertModel {
	private String border_title;
	private String user_name;
	private MultipartFile[] file;
	private String content_textarea;
	private String user_ip;
	
	public String getBorder_title() {
		return border_title;
	}
	public void setBorder_title(String border_title) {
		this.border_title = border_title;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public MultipartFile[] getFile() {
		return file;
	}
	public void setFile(MultipartFile[] file) {
		this.file = file;
	}
	public String getContent_textarea() {
		return content_textarea;
	}
	public void setContent_textarea(String content_textarea) {
		this.content_textarea = content_textarea;
	}
	public String getUser_ip() {
		return user_ip;
	}
	public void setUser_ip(String user_ip) {
		this.user_ip = user_ip;
	}
	
	

}
