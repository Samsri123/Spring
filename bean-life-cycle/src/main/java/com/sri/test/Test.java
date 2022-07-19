package com.sri.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.dao.StudentConfig;
import com.sri.dao.StudentDAO;

public class Test {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentDAO student = context.getBean("studentDAO",StudentDAO.class);
		student.selectAllRows();
		student.deleteStudent(4);
		student.selectAllRows();
		context.close();
	}
}
