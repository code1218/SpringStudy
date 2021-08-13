package com.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.mvc.model.LoginModel;

@Repository
public class LoginDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public int loginCheck(LoginModel loginModel) {
		String sql = "select count(*) from user_mst where user_id = ? and user_pwd = ?";
		int flag = jdbcTemplate.queryForObject(sql, new Object[] {loginModel.getLogin_id(), loginModel.getLogin_pwd()},
				new RowMapper<Integer>() {
			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getInt(1);
			}
		});
		return flag;
	}

}







