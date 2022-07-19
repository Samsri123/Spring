package com.sri.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sri.model.*;
public class Body {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/model/applicationContext.xml");
		Human human = (Human) context.getBean("human");
		human.startPumping();
	}
}
