package org.boot.controller;

import org.boot.entity.User;
import org.boot.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/studentController")
public class studentController {
	
	
	@Autowired
	@Qualifier("studentService")
	studentService studentService;
	
	public studentController() {
		super();
	}
	public studentController(studentService studentservice) {
		super();
		this.studentService = studentservice;
	}
	public studentService getStudentservice() {
		return studentService;
	}
	public void setStudentservice(studentService studentservice) {
		this.studentService = studentservice;
	}
	
	
	@ResponseBody
	@RequestMapping("/query")
	public ModelAndView query(@RequestParam("userName") String userName) {
		ModelAndView mv=new ModelAndView("result");
		User user=studentService.queryUserByuserName(userName);		
		mv.addObject("user", user);
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("/welcome")
	public String welcome() {
		return "Hello HAHAHA";	
	}
	
	
	
}
