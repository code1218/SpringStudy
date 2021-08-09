package com.spring.mvc.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/mvc/context/DiBeans.xml");
		DiContext di = (DiContext)context.getBean("diex2");
		di.diConnection();
	}

}
