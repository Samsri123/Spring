package com.sri.model;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String name;
	
	@Value("${student.course}")
	private String course;
	
	@Value("${student.hobby}")
	private String hobby;

	/*
	 * public String getName() { return name; }
	 */
	
	
	/*
	 * @Value("${student.name}") public void setName(String name) { this.name =
	 * name; }
	 */
	

	/*
	 * public String getCourse() { return course; }
	 */
	
	
	
	/*
	 * @Value("${student.course}") public void setCourse(String course) {
	 * this.course = course; }
	 */
	
	

	/*
	 * public String getHobby() { return hobby; }
	 */
	
	
	/*
	 * @Value("${student.hobby}") public void setHobby(String hobby) { this.hobby =
	 * hobby; }
	 */
	
	
	public void displayStudentInfo() {
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
		System.out.println("Hobby: "+hobby);
	}
}
