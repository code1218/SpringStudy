package com.spring.mvc.context;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("diex1")
public class DiEx1 implements DiContext{
	
	@Value("김준일")
	private String name;
	@Value("010-9988-1916")
	private String phone;
	
	@Override
	public String diConnection() {
		return "성명: " + name + " 연락처: " + phone;
	}
}





