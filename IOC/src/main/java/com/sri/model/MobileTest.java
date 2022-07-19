package com.sri.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Jio jio = (Jio)context.getBean("jio");
//		jio.calling();
//		jio.data();
		Sim sim = (Sim)context.getBean("sim");
		//Without touching the source code we make the changes using Spring Framework
		sim.calling();
		sim.data();
	}
}
