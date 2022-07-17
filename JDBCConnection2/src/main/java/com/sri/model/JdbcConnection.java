package com.sri.model;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	@Value("${mySql.url}")
	private String url;
	@Value("${mySql.username}")
	private String username;
	@Value("${mySql.password}")
	private String password;
	@Value("${mySql.driver}")
	private String driver;
	public void display() {
		System.out.println("User Name: "+username+"\nPassword: "+password+"\nURL :"+url+"\nDriver :"+driver);
	}
	public void getJdbcConnection()throws Exception{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection Successfull");
	}
}
