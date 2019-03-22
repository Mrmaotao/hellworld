package com.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.domain.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.service.StudentService;
import com.ssm.util.Page;
import com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations.PrivateKeyResolver;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MbatisTest {
	
	

		@Autowired
		private StudentMapper categoryMapper;
		@Autowired
		private StudentService studentService;
		@Test
		public void testAdd() {
			for(int i=0;i<100;i++){
				Student category = new Student();
				category.setName("new Category111"+i);
				categoryMapper.add(category);
			}
			
		}

		@Test
		public void testList() {
			System.out.println(categoryMapper);
			List<Student> cs=categoryMapper.list();
			for (Student c : cs) {
				System.out.println(c.getName());
			}
		}
		@Test
		public void testAddTwo(){
			studentService.deleteAll();
			studentService.addTwo();
		}
//		@Test
//		public void testTotal(){
//			int total = categoryMapper.total();
//			System.out.println(total);
//		}
//		@Test
//		public void testListPage(){
//			Page p = new Page();
//			p.setStart(2);
//			p.setCount(5);
//			List<Student>list = categoryMapper.list(p);
//			for (Student student : list) {
//				System.out.println(student);
//			}
//		}

	
}
