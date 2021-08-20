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
	
	@Override
	public BorderBean getBorderDtl(int border_code) {
		return session.selectOne(NAME_SPACE + ".getBorderList", border_code);
	}
	
	@Override
	public BorderBean getPreBorderCode(int border_code) {
		return session.selectOne(NAME_SPACE + ".getPreBorderCode", border_code);
	}
	
	@Override
	public BorderBean getNextBorderCode(int border_code) {
		return session.selectOne(NAME_SPACE + ".getNextBorderCode", border_code);
	}
	
	@Override
	public Integer insertBorder(BorderBean borderBean) {
		return session.insert(NAME_SPACE + ".insertBorder", borderBean);
	}
}








