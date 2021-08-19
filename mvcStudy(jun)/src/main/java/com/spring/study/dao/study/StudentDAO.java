package com.spring.study.dao.study;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.study.mapper.study.StudentMapper;
import com.spring.study.model.study.Student;

@Component
public class StudentDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Student> select(){
		String sql = "select * from student_mst";
		List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
		return students;
	}
	
	public void insert(Student student) {
		String sql = "insert into student_mst values(0, ?, ?, ?)";
		jdbcTemplate.update(sql, student.getId(), student.getName(), student.getPhone());
	}
}
