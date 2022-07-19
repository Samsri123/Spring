package com.sri.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sri.*;
import com.sri.beans.WishMessageGenerator;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sri/cfgs/applicationContext.xml");
		WishMessageGenerator wmg =(WishMessageGenerator) context.getBean("wmg");
		String result = wmg.showWishMessage("Srikanth");
		System.out.println(result);
	}
}
