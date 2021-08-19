package com.spring.mvc.service.border;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.spring.mvc.dao.MyBatisBorderDao;
import com.spring.mvc.model.BorderInsertModel;
import com.spring.mvc.model.beans.BorderBean;

@Service
public class BorderInsertService {
	
	@Autowired
	private MyBatisBorderDao  myBatisBorderDao;
	
	public void fileUpload(BorderInsertModel borderInsertModel) throws IllegalStateException, IOException {
		MultipartFile multipartFile = borderInsertModel.getFile();
		String originalFile = multipartFile.getOriginalFilename();
		String originalFileExtension = originalFile.substring(originalFile.lastIndexOf(".")); 
		String tempFile = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension;
		String filePath = "C:\\김준일강사수업\\fileupload\\";
		File file = new File(filePath + tempFile);
		multipartFile.transferTo(file);
		
		BorderBean borderBean = new BorderBean();
		borderBean.setBorder_title(borderInsertModel.getBorder_title());
		borderBean.setBorder_content(borderInsertModel.getContent_textarea());
		borderBean.setBorder_file(originalFile);
		borderBean.setBorder_tempfile(tempFile);
		borderBean.setWriter_name(borderInsertModel.getUser_name());
		borderBean.setWriter_ip(borderInsertModel.getUser_ip());
		
		int insertCount = myBatisBorderDao.insertBorder(borderBean);
		
	}
	
}
