package com.sri.dependencyObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*Student student = new Student();
		MathCheat mathCheat = new MathCheat();
		student.setMathCheat(mathCheat);
		student.cheating();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/dependencyObject/applicationContext.xml");
		Student student =(Student) context.getBean("student");
		student.cheating();
		AnotherStudent anotherStudent = (AnotherStudent) context.getBean("anotherStudent");
		anotherStudent.startCheat();
	}
}
