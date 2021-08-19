package com.spring.mvc.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.spring.study.model.study.Student;

public class Main {

	public static void main(String[] args) throws IOException {
		selectStudent();

	}
	
	public static void selectStudent() throws IOException {
		Reader reader = Resources.getResourceAsReader("com/spring/mvc/mybatis/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		
		List<Student> list = session.selectList("Student.getStudentList");
		List<Integer> seqList = session.selectList("Student.getStudentSeq");
		int seq = 2;
		String name = session.selectOne("Student.getStudentNameOne", seq);
		
		for(Student s : list) {
			System.out.println(s);
		}
		
		for(Integer i : seqList) {
			System.out.println(i);
		}
		
		System.out.println("학생이름: " + name);
	}

}








