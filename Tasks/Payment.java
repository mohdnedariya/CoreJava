package com.task;

//abstract class
abstract class Payment 
{
	abstract void pay(double amount);
}	

//credit card payment implementation
class CreditCard extends Payment
{
	void pay(double amount) 
	{
		System.out.println("Payed "+amount+" through Credit Card");
	}
}

//UPI payment implementation 
class UPIPayment extends Payment
{
	void pay(double amount) 
	{
		System.out.println("Payed "+amount+" through UPI");
	}
}


