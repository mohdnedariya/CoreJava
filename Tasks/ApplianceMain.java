package com.task;

public class ApplianceMain 
{

	public static void main(String[] args) 
	{
		//creating object of WashingMachine class
		WashingMachine w1 = new WashingMachine();
		w1.operate();

		//creating object of Microwave class
		Microwave m1 = new Microwave();
		m1.operate();
	}

}
