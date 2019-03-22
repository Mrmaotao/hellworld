package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.domain.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.service.StudentService;
import com.ssm.util.Page;
//将studentServiceImpl被标注为@service标示为一个service并装配StudentMapper
@Service
public final class StudentServiceImpl implements StudentService{
	@Autowired
	StudentMapper studentmapper;
	
	public List<Student> list() {
		return studentmapper.list();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addTwo() {
		Student s1 = new Student();
		s1.setName("毛涛1");
		studentmapper.add(s1);
		
		Student s2 = new Student();
		s2.setName("名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,");
		studentmapper.add(s2);
	}

	@Override
	public void deleteAll() {
		List<Student>list = list();
		for (Student student : list) {
			studentmapper.delete(student.getId());
		}
	}

//	public int total() {
//		return studentmapper.total();
//	}
//
//	@Override
//	public List<Student> list(Page page) {
//		return studentmapper.list(page);
//	}
	

}
