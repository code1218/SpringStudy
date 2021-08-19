package com.spring.study.context;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("diex2")
public class DiEx2 implements DiContext{
	
	@Value("김준일")
	private String name;
	@Value("123456-1234567")
	private String number;
	
	public DiEx2() {
		// TODO Auto-generated constructor stub
	}
	
	public DiEx2(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String diConnection() {
		return "성명: " + name + " 주민번호: " + number;
	}
}




