package com.spring.mvc.context;

public class DiEx2 implements DiContext{
	
	private String name;
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




