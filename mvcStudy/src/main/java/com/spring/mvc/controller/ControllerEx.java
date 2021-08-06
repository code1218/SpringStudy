package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.ModelEx;

@Controller
public class ControllerEx {
	
	@RequestMapping(value = "/string", method = RequestMethod.GET)
	public String controller(Model model) {
		model.addAttribute("model", new ModelEx("String model"));
		return "/controllerEx/controller1";
	}
	
	@RequestMapping(value = "/modelAndView", method = RequestMethod.GET)
	public ModelAndView controller2() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/controllerEx/controller2");	//view
		mav.addObject("model", new ModelEx("ModelAndView model"));	//model
		return mav;
	}
	
	@RequestMapping(value = "/controllerEx/void", method = RequestMethod.GET)
	public void controller3(Model model) {
		model.addAttribute("model", new ModelEx("void model"));
	}
	
	@RequestMapping(value = "/controllerEx/modelEx", method = RequestMethod.GET)
	public ModelEx controller4() {
		return new ModelEx("ModelEx Class model");
	}
	
	
}










