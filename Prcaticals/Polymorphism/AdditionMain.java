package com.corejava;

public class AdditionMain 
{

	public static void main(String[] args) 
	{
		Addition sum1 = new Addition();
		System.out.println("the sum of 2 integer number are : "+ sum1.add(30, 50));
		System.out.println("the sum of 3  integer number are: "+sum1.add(80,100, 120));
		System.out.println("the sum of 2  decimal number are:" +sum1.add(2.6, 8.1));
	}

}
