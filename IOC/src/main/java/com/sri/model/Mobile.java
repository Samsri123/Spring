package com.sri.model;

public class Mobile {
	public static void main(String[] args) {
		Sim sim = new Airtel();//Without touching the source code we can make the changes using Spring Framework
		sim.calling();
		sim.data();
	}
}
