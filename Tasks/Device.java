package com.task;

class Device 
{
	String brand;
	String model;
	
	Device(String brand , String model)
	{
		this.brand = brand;
		this.model= model;
	}
	
	//method to display properties
	void showDetails()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
	}
}

//class Laptop extends device
class Laptop extends Device
{
	int ram;
	int storage;
	
	Laptop(String brand , String model, int ram ,int storage)
	{
		//getting values from device class using super keyword
		super(brand,model);
		this.ram = ram;
		this.storage = storage;
	}
	
	void showDetails()
	{
		super.showDetails();
		System.out.println("ram: "+ram);
		System.out.println("storage: "+storage);
	}
}

class GamingLaptop extends Laptop
{
	 String graphicsCard;
	 
	 GamingLaptop(String brand , String model, int ram ,int storage, String graphicsCard)
	 {
		 super(brand, model, ram,storage);
		 this.graphicsCard = graphicsCard;
	 }
	 
	 void showDetails() 
	 {
		 super.showDetails();
		 System.out.println("GraphicsCard: "+graphicsCard);
	 }
}