package com.spring.mvc.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc.model.beans.JoinBean;

public class JoinDAOIpml implements JoinDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String NAME_SPACE = "com.spring.mvc.dao";
	
	@Override
	public int joinIdCheck(String id) {
		return sqlSession.selectOne(NAME_SPACE + ".joinIdCheck", id);
	}
	
	@Override
	public int joinInsert(JoinBean bean) {
		return sqlSession.insert(NAME_SPACE + ".joinInsert", bean);
	}
}
