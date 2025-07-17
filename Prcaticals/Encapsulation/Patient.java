package com.corejava;

//POJO Class (Plain Old Java object)
public class Patient 
{
	
	//private variable (encapsulated)
	private String name;
	private int age;
	private double temperature;
	
	//public getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
}
