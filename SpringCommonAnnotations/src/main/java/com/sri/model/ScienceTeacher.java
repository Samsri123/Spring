package com.sri.model;

import org.springframework.stereotype.Component;

@Component			//To create bean and use it before the class
public class ScienceTeacher implements Teacher {

	public void teach() {
		System.out.println("Hi I am your Science teacher.\nMy name is Sam");
	}

}
