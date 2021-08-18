package com.spring.mvc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc.model.beans.BorderBean;

public class MybatisBorderDaoImpl implements MyBatisBorderDao {
	
	@Autowired
	private SqlSession session; 
	
	private static final String NAME_SPACE = "com.spring.mvc.dao.MyBatisBorderDao"; 
	
	@Override
	public List<BorderBean> getBorderList() {
		return session.selectList(NAME_SPACE + ".getBorderList");
	}
}
