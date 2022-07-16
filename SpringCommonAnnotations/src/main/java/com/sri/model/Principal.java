package com.sri.model;

import org.springframework.stereotype.Component;

@Component		//To create bean and use it before the class
public class Principal {
	public void principlelInfo() {
		System.out.println("Hii Iam your principle .\nMy name is James Bond");
	}
}
