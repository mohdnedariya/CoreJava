package com.corejava;

//parent class
class Animal 
{
	void sound() 
	{
		System.out.println("Animal make Sound ");
	}
}

//child class dog inherits features from parent class animal

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dogs bark");
	}
}