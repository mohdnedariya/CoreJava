package com.task;

class Product 
{
	//private variables
	private double price;
	private int quantity;
	
	//getters & setters
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getQuantity() 
	{
		return quantity;
	}
	
	//applying logic if the quantity is greater than 18 apply 20% discount
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
		if(quantity > 18)
		{
			this.price = this.price-(this.price * 0.20);
		}
	}
	
	
}
