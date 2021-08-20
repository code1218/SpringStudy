package com.spring.mvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dao.BorderDAO;
import com.spring.mvc.model.BorderDtlModel;
import com.spring.mvc.model.BorderInsertModel;
import com.spring.mvc.model.BorderListModel;
import com.spring.mvc.service.border.BorderDtlService;
import com.spring.mvc.service.border.BorderInsertService;
import com.spring.mvc.service.border.BorderListSet;

@Controller
public class BorderController {
	
	@Autowired
	BorderListSet borderListSet;
	
	@Autowired
	BorderDtlService borderDtlService;
	
	@Autowired
	BorderInsertService borderInsertService;
	
	@Autowired
	BorderDAO borderDAO;
	
	@Autowired
	ServletContext context;
	
	@RequestMapping(value = "/border", method = RequestMethod.GET)
	public ModelAndView borderIndex() {
		ModelAndView view = new ModelAndView("/border/border");
		BorderListModel model = new BorderListModel();
		model.setPage(1);
		model.setBorderList(borderListSet.getBorderList(model.getPage()));
		model.setTotalPage(borderListSet.getTotalPage());
		model.setPageStart(borderListSet.getPageStart(model.getPage()));
		model.setPageEnd(borderListSet.getPageEnd(model.getPage()));
		view.addObject("borderModel", model);
		return view;
	}
	
	@RequestMapping(value = "/borderp", method = RequestMethod.GET)
	public ModelAndView borderIndex2(@RequestParam("page")String page) {
		ModelAndView view = new ModelAndView("/border/border");
		BorderListModel model = new BorderListModel();
		model.setPage(Integer.parseInt(page));
		model.setBorderList(borderListSet.getBorderList(model.getPage()));
		model.setTotalPage(borderListSet.getTotalPage());
		model.setPageStart(borderListSet.getPageStart(model.getPage()));
		model.setPageEnd(borderListSet.getPageEnd(model.getPage()));
		view.addObject("borderModel", model);
		return view;
	}
	
	@RequestMapping(value = "/borderinsert", method = RequestMethod.GET)
	public ModelAndView borderInsert() {
		ModelAndView view = new ModelAndView("/border/borderinsert");
		return view;
	}
	
	@RequestMapping(value = "/borderdatainsert", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ModelAndView borderDataInsert(BorderInsertModel borderInsertModel, HttpServletRequest request) throws IllegalStateException, IOException {
		ModelAndView view = new ModelAndView("/border/border");
		borderInsertModel.setUser_ip(request.getRemoteAddr());
		//String realPath = request.getRealPath("/jspEx/upload");
		borderInsertService.fileUpload(borderInsertModel);
		
		BorderListModel model = new BorderListModel();
		model.setPage(1);
		model.setBorderList(borderListSet.getBorderList(model.getPage()));
		model.setTotalPage(borderListSet.getTotalPage());
		model.setPageStart(borderListSet.getPageStart(model.getPage()));
		model.setPageEnd(borderListSet.getPageEnd(model.getPage()));
		view.addObject("borderModel", model);
		
		return view;
	}
	
	@RequestMapping(value = "/borderdtl", method = RequestMethod.GET)
	public ModelAndView borderDtl(@RequestParam("border_code")String border_code, 
			@RequestParam("page")String page) {
		ModelAndView view = new ModelAndView("/border/borderdtl");
		BorderDtlModel model = borderDtlService.getBorderDtlModel(border_code);
		model.setPage(page);
		view.addObject("borderDtlModel", model);
		return view;
	}
	
	@RequestMapping(value="/fileDownload", method = RequestMethod.GET)
	@ResponseBody
	public byte[] fileDownload(
				HttpServletResponse response,
				@RequestParam("originName")String originName,
				@RequestParam("tempName")String tempName) throws IOException {
		
		String filePath = context.getRealPath("/static/upload");
		File file = new File(filePath, tempName);
		byte[] bytes = FileCopyUtils.copyToByteArray(file);
		
		String originFileName = new String(originName.getBytes("UTF-8"), "ISO-8859-1");
		
		response.setHeader("Content-Disposition", "attachment;filename=\"" + originFileName + "\"");
		response.setContentLength(bytes.length);
		return bytes;
	}
	
}







