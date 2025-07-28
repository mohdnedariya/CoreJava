package com.task;

public class ProductMain 
{

	public static void main(String[] args) 
	{
		//creating object to print the values
		Product p1 = new Product();
		
		//setting the values
		p1.setPrice(100);
		p1.setQuantity(25);
		
		
		//getting the values
		System.out.println("Price: "+p1.getPrice());
		System.out.println("Quantity: "+p1.getQuantity());
	}

}
