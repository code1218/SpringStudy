package com.spring.mvc.service.border;

import org.springframework.stereotype.Service;

import com.spring.mvc.model.BorderInsertModel;

@Service
public class BorderInsertService {
	
	public void fileUpload(BorderInsertModel borderInsertModel) {
		String originalFile = borderInsertModel.getFile().getOriginalFilename();
		String originalFileExtension = originalFile.substring(originalFile.lastIndexOf(".")); 
		
	}
	
}
