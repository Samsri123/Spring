package com.sri.model;

public class Student {
	private int id;
	private Cheat cheat;
	public void setId(int id) {
		this.id = id;
	}
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	public void cheats() {
		cheat.cheating();
		System.out.println("My id is : "+id+ " take and Do what you want to Do..!");
	}
}
