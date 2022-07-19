package com.sri.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*Student student = new Student();
		MathCheat mathCheat = new MathCheat();
		student.setMathCheat(mathCheat);
		student.cheating();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student =(Student) context.getBean("student");
		student.cheats();
		
	}
}
