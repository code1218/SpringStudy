package com.spring.study.mapper.study;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.study.model.study.Student;

public class StudentMapper implements RowMapper<Student>{
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setSeq(rs.getInt(1));
		student.setId(rs.getString(2));
		student.setName(rs.getString(3));
		student.setPhone(rs.getString(4));
		return student;
	}
}
