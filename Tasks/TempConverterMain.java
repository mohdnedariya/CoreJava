package com.task;

public class TempConverterMain 
{

	public static void main(String[] args) 
	{
		//creating object 
		TempConverter temp1 = new TempConverter();
		
		//setting values
		temp1.setCelcius(28);
		temp1.setFahrenheit(10);
		
		//displaying the values
		System.out.println("Celcius: "+temp1.getCelcius());
		System.out.println("Fahrenheit: "+temp1.getFahrenheit());

	}

}
