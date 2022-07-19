package com.sri.dependencyObject;

public class AnotherStudent {
	int id;
	MathCheat cheat;
	public void setId(int id) {
		this.id = id;
	}
	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	public void startCheat() {
		cheat.mathCheat();
		System.out.println("My id is "+id);
	}
	
}
