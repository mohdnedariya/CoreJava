package com.corejava;

class Vehicle 
{
	void engine() 
	{
	System.out.println("engine started");	
	}
	
}
//child class bike inheriting feature of parent class vehicle

class Bike extends Vehicle
{
	void kickStart() 
	{
		System.out.println("Bike kick Started");
	}
}
class SportsBike extends Bike
{
	void boostMode()
	{
	System.out.println("boost mode activated");	
	}
}