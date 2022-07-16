package com.sri.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sri.model.JDBCConnection;
public class Client {
	public static void main(String[] args)throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JDBCConnection jdbc = (JDBCConnection) context.getBean("jdbc");
		jdbc.display();
		jdbc.getJDBCConnection();
	}
}
