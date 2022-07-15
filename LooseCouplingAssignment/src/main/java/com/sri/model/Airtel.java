package com.sri.model;

public class Airtel {
	private String name, mobileNo;
	private Service service;

	public Airtel(String name, String mobileNo, Service service) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.service = service;
	}

	public void activateService() {
		System.out.println("Name: " + name + "\nMobile Number: " + mobileNo);
		service.service();
	}
}
