package com.ssm.mapper;

import java.util.List;

import com.ssm.domain.Student;
import com.ssm.util.Page;

public interface StudentMapper {
	public int add(Student stu);
	
	public void delete(int id);
	
	public Student get(int id);
	
	public int update(Student stu);
	
	public List<Student> list();
	
//	public List<Student> list(Page page);
//	
//	public int total();
}
