package com.corejava;

interface SampleInterface
{
	void display();  // abstract method
	
	
}

class InterfaceTest implements SampleInterface
{
	public void display()
	{
		System.out.println("display method implementation is executed");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		SampleInterface obj =new InterfaceTest();
		obj.display();
        InterfaceTest obj1 = new InterfaceTest();
	    obj1.display();
	}

}
