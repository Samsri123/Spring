package com.sri.model;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	@Value("${mySql.driver}")
	private String driver;
	
	@Value("${mySql.url}")
	private String url;
	
	@Value("${mySql.userName}")
	private String userName;
	
	@Value("${mySql.password}")
	private String password;
	
	public void display() {
		System.out.println("User Name: "+userName+"\nPassword: "+password+"\nURL :"+url+"\nDriver :"+driver);
	}
	
	public void getJDBCConnection()throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,userName,password);
		System.out.println("Connection Successful "+con);
		
	}
}
