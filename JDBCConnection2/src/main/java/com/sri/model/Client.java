package com.sri.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args)throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		JdbcConnection con = context.getBean("jdbcConnection",JdbcConnection.class);
		con.display();
		con.getJdbcConnection();
	}
}
