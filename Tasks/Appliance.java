package com.task;

//abstract class
abstract class Appliance 
{
	abstract void operate();
}

//WashingMachine implements Appliance
class WashingMachine extends Appliance
{
	void operate() 
	{
		System.out.println("Operating Washing Machine");
	}
}

//Microwave implements Appliance
class Microwave extends Appliance
{
	void operate()
	{
		System.out.println("Operating Microwave");
	}
}
