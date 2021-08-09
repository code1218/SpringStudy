package com.spring.mvc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/mvc/context/DiBeans.xml");
		DiConnectionEx di = (DiConnectionEx)context.getBean("diConnectionEx");
		System.out.println(di);
	}

}
