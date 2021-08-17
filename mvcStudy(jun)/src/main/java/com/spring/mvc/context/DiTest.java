/*
 * package com.spring.mvc.context;
 * 
 * import org.springframework.context.ApplicationContext; import
 * org.springframework.context.annotation.AnnotationConfigApplicationContext;
 * import org.springframework.context.support.ClassPathXmlApplicationContext;
 * 
 * public class DiTest {
 * 
 * public static void main(String[] args) { AnnotationConfigApplicationContext
 * an = new AnnotationConfigApplicationContext();
 * an.register(com.spring.mvc.context.DiAppConfig.class); an.refresh();
 * 
 * //ApplicationContext context = new
 * AnnotationConfigApplicationContext(com.spring.mvc.context.DiAppConfig.class);
 * //ApplicationContext context = new
 * ClassPathXmlApplicationContext("com/spring/mvc/context/DiBeans.xml");
 * //DiConnectionEx di = (DiConnectionEx)context.getBean("diconnectionEx");
 * DiConnectionEx di = (DiConnectionEx)an.getBean("diconnectionEx");
 * System.out.println(di); }
 * 
 * }
 */