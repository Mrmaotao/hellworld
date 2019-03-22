package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.domain.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.service.StudentService;
import com.ssm.util.Page;
//告诉SpringMVC这是一个控制器
@Controller
@RequestMapping("")

public class StudentController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping("listStudent")
	public  ModelAndView listStudent(Page page){
		ModelAndView mv = new ModelAndView();
		PageHelper.offsetPage(page.getStart(),5);
		List<Student> li=studentService.list();
		int count =(int) new PageInfo<>(li).getTotal();
		page.calcuteLast(count);
//		放入转发参数
		mv.addObject("li",li);
//		放入jsp路径
		mv.setViewName("listStudent");
		System.out.println(mv);
		return mv;
	}
}
