package com.spring.study.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("diConnectionEx")
public class DiConnectionEx {
	
	@Autowired(required = false)
	@Qualifier("diex")
	private DiContext diex;
	
	public DiConnectionEx() {
		System.out.println("기본생성자");
	}
	
	
	public DiConnectionEx(DiContext diex) {
		super();
		System.out.println("필드 주입 생성자");
		this.diex = diex;
	}

	public DiContext getDiex() {
		return diex;
	}

	
	public void setDiex(DiContext diex) {
		System.out.println("setter 주입");
		this.diex = diex;
	}

	@Override
	public String toString() {
		if(diex == null) {
			return "";
		}else {
			return diex.diConnection();
		}
	}

}
