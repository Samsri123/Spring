package com.sri.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.beans.*;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/cfgs/applicationContext.xml");
		Order order = (Order) context.getBean("ord");
		System.out.println(order.getProductID());
		System.out.println(order.getCustomer());
	}
}
