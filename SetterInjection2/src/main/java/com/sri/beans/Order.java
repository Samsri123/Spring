package com.sri.beans;
public class Order {
	private String productName,productID,productPrice;
	private Customer customer;
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public Order(String productName,String productID, String productPrice) {
		this.productName=productName;
		this.productID=productID;
		this.productPrice=productID;
	}
	
	public String getProductName() {
		return productName;
	}
	public String getProductID() {
		return productID;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public String getCustomer() {
		return customer.getName()+"\n"+customer.getContact()+"\n"+customer.getAddress();
	}
}
