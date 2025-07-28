package com.task;

public class TempConverter 
{
	//Creating private variables
	private double celcius;
	private double fahrenheit;
	
	//Getters & Setters
	public double getCelcius()
	{
		return celcius;
	}
	
	public double getFahrenheit() 
	{
		return fahrenheit;
	}
	public void setFahrenheit(double fahrenheit) 
	{
		this.fahrenheit = fahrenheit;
		//formula for fahrenheit
		this.celcius = (fahrenheit - 32) * 5/9;
	}
	public void setCelcius(double celcius) 
	{
		this.celcius = celcius;
		//formula for celcius 
		this.fahrenheit = (celcius * 9/5) + 32;
	}
}
