package com.sri.beans;

public class Customer {
	private String name,contact,address;
	public Customer(String name,String contact,String address ) {
		this.name=name;
		this.contact=contact;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public String getContact() {
		return contact;
	}
	public String getAddress() {
		return address;
	}
	
}
