package com.sri.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import oracle.jdbc.proxy.annotation.Post;
@Component
public class StudentDAO {
	@Value("${mySql.username}")
	private String username;
	@Value("${mySql.password}")
	private String password;
	@Value("${mySql.url}")
	private String url;
	@Value("${mySql.driver}")
	private String driver;
	Connection con;
	@PostConstruct
	public void getConnection()throws Exception {
		System.out.println("Creating connection for student DB");
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);
	}
	@PreDestroy
	public void closeConnection()throws Exception {
		System.out.println("Closing connection..!");
		con.close();
	}
	public void selectAllRows() throws Exception {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from hostelstudent");
		while (rs.next()) {
			int studentID = rs.getInt(1);
			String studentName = rs.getString(2);
			int fee = rs.getInt(3);
			String foodType = rs.getString(4);
			System.out.println(studentID+" "+studentName+" "+fee+" "+foodType);
		}
		
		
	}
	public void deleteStudent(int studentID)throws Exception {
		Statement stmt = con.createStatement();
		stmt.executeUpdate("delete from hostelStudent where studentID="+studentID);
		System.out.println("Record deleted with studentID: "+studentID);
		
	}
}
