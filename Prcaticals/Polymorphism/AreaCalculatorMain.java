package com.corejava;

public class AreaCalculatorMain 
{

	public static void main(String[] args) 
	{
	
		//creating an object of main class
		AreaCalculator area1 = new AreaCalculator();
		
		System.out.println("Area of Square : "+ area1.areaofsquare(4));
		System.out.println("Area of Rectangle : "+ area1.areaofrectangle(5, 8));
		System.out.println("Area of Circle : "+ area1.areaofcircle(5.6));

	}

}
