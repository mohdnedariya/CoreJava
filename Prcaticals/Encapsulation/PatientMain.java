package com.corejava;

public class PatientMain 
{

	public static void main(String[] args) 
	{
		//Creating object of Patient Class
		Patient p1 = new Patient();
		
		//setting the values
		p1.setName("Mohammad");
		p1.setAge(23);
		p1.setTemperature(23.5);
		
		//printing the values
		System.out.println("Patient Name: "+ p1.getName());
		System.out.println("Patient Age: "+ p1.getAge());
		System.out.println("Patient Temperature: "+ p1.getTemperature());

	}

}
