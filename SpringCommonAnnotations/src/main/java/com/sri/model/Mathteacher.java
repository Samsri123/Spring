package com.sri.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component		//To create bean and use it before the class
@Primary		//To inject the default object_dependecy and use it before the bean Class
public class Mathteacher implements Teacher {

	public void teach() {
		System.out.println("Hi I am your Math teacher.\nMy name is Srikanth");
	}

}
