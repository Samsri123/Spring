package com.sri.beans;
import java.util.Date;
public class WishMessageGenerator {
	private Date date;
	public void setDate(Date date) {
		this.date=date;
	}
	public String showWishMessage(String user) {
		int hour = date.getHours();
		if(hour < 12) {
			return "Good Morning..."+user;
		}else if(hour <16) {
			return "Good After Noon..."+user;
		}else if(hour<20) {
			return "Good Evening..."+user;
		}else {
			return "Good Night..."+user;
		}
	}
}
