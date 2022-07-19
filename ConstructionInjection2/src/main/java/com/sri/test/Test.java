package com.sri.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.beans.*;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/cfgs/applicationContext.xml");
		Customer customer = (Customer) context.getBean("cus");
		System.out.println(customer.getName());
	}
}
