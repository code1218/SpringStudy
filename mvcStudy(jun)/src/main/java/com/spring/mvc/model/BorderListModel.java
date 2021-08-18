package com.spring.mvc.model;

import java.util.ArrayList;

import com.spring.mvc.model.beans.BorderBean;

public class BorderListModel {
	private int page;
	private int totalPage;
	private int pageStart;
	private int pageEnd;
	private ArrayList<BorderBean> borderList;

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageStart() {
		return pageStart;
	}
	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}
	public int getPageEnd() {
		return pageEnd;
	}
	public void setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}
	public ArrayList<BorderBean> getBorderList() {
		return borderList;
	}
	public void setBorderList(ArrayList<BorderBean> borderList) {
		this.borderList = borderList;
	}
	
}
