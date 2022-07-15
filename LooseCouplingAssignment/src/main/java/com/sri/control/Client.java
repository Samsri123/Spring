package com.sri.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.model.*;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Airtel airtel = (Airtel) context.getBean("airtel");
		airtel.activateService();
	}
}
