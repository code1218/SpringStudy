package com.spring.mvc.dao;

import com.spring.mvc.model.beans.JoinBean;

public interface JoinDAO {
	public int joinIdCheck(String id);
	public int joinInsert(JoinBean bean);
}
