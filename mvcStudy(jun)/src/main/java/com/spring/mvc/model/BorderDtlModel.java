package com.spring.mvc.model;

import java.util.List;

import com.spring.mvc.model.beans.FileBean;

public class BorderDtlModel {
	private String border_title;
	private String border_date;
	private String writer_name;
	private int border_count;
	private List<FileBean> fileName;
	private String border_content;
	private String page;
	private int border_code_pre;
	private String border_title_pre;
	private int border_code_next;
	private String border_title_next;
	
	public String getBorder_title() {
		return border_title;
	}
	public void setBorder_title(String border_title) {
		this.border_title = border_title;
	}
	public String getBorder_date() {
		return border_date;
	}
	public void setBorder_date(String border_date) {
		this.border_date = border_date;
	}
	public String getWriter_name() {
		return writer_name;
	}
	public void setWriter_name(String writer_name) {
		this.writer_name = writer_name;
	}
	public int getBorder_count() {
		return border_count;
	}
	public void setBorder_count(int border_count) {
		this.border_count = border_count;
	}
	public List<FileBean> getFileName() {
		return fileName;
	}
	public void setFileName(List<FileBean> fileName) {
		this.fileName = fileName;
	}
	public String getBorder_content() {
		return border_content;
	}
	public void setBorder_content(String border_content) {
		this.border_content = border_content;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public int getBorder_code_pre() {
		return border_code_pre;
	}
	public void setBorder_code_pre(int border_code_pre) {
		this.border_code_pre = border_code_pre;
	}
	public String getBorder_title_pre() {
		return border_title_pre;
	}
	public void setBorder_title_pre(String border_title_pre) {
		this.border_title_pre = border_title_pre;
	}
	public int getBorder_code_next() {
		return border_code_next;
	}
	public void setBorder_code_next(int border_code_next) {
		this.border_code_next = border_code_next;
	}
	public String getBorder_title_next() {
		return border_title_next;
	}
	public void setBorder_title_next(String border_title_next) {
		this.border_title_next = border_title_next;
	}
	
	
	
}
