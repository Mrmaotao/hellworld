package com.ssm.service;

import java.util.List;

import com.ssm.domain.Student;
import com.ssm.util.Page;

public interface StudentService {
	List <Student> list();
//	int total();
//	List<Student> list(Page page);
	void addTwo();
	void deleteAll();
}
