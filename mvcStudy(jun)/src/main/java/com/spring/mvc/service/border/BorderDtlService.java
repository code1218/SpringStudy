package com.spring.mvc.service.border;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.dao.BorderDAO;
import com.spring.mvc.model.BorderDtlModel;
import com.spring.mvc.model.beans.BorderBean;

@Service
public class BorderDtlService {
	
	@Autowired
	BorderDAO borderDAO;
	
	public BorderDtlModel getBorderDtlModel(String border_code) {
		int i_border_code = Integer.parseInt(border_code);
		
		BorderDtlModel model = new BorderDtlModel();
		
		BorderBean borderBean = borderDAO.getBorderDtl(i_border_code);
		BorderBean borderBean_pre = borderDAO.getPreBorderCode(i_border_code);
		
		model.setBorder_title(borderBean.getBorder_title());
		model.setBorder_date(borderBean.getBorder_date());
		model.setWriter_name(borderBean.getWriter_name());
		model.setBorder_count(borderBean.getBorder_count());
		model.setBorder_file(borderBean.getBorder_file());
		model.setBorder_content(borderBean.getBorder_content());
		model.setBorder_code_pre(borderBean_pre.getBorder_code());
		model.setBorder_title_pre(borderBean_pre.getBorder_title());
		return model;
	}
	
	
	
}
