package com.spring.mvc.dao;

import java.util.List;

import com.spring.mvc.model.beans.BorderBean;

public interface MyBatisBorderDao {
	public List<BorderBean> getBorderList();
	public BorderBean getBorderDtl(int border_code);
}
