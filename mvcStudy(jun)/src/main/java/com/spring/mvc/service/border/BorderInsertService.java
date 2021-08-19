package com.spring.mvc.service.border;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.mvc.model.BorderInsertModel;

@Service
public class BorderInsertService {
	
	public void fileUpload(BorderInsertModel borderInsertModel) throws IllegalStateException, IOException {
		MultipartFile multipartFile = borderInsertModel.getFile();
		String originalFile = multipartFile.getOriginalFilename();
		String originalFileExtension = originalFile.substring(originalFile.lastIndexOf(".")); 
		String tempFile = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension;
		String filePath = "C:\\김준일강사수업\\fileupload\\";
		File file = new File(filePath + tempFile);
		System.out.println(file.getPath());
		System.out.println(file.getName());
		multipartFile.transferTo(file);
		
	}
	
}
