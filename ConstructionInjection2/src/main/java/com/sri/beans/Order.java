package com.sri.beans;
public class Order {
	private String productName,productID,productPrice;
	private Customer customer;
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getCustomer() {
		return customer.getName()+"\n"+customer.getContact()+"\n"+customer.getAddress();
	}
}
