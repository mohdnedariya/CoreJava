package com.corejava;

public class AreaCalculator 
{
	//method for area of square
	int areaofsquare(int side) 
	{
		return side * side;
	}
	
	//method for area of rectangle
	int areaofrectangle(int length,int breadth) 
	{
		return length * breadth;
	}
	
	//method for area of circle
	double areaofcircle(double radius)
	{
		return 3.14 * radius * radius;
	}
}
