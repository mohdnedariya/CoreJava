package com.task;

public class PaymentMain 
{

	public static void main(String[] args) 
	{
		
		//creating object CreditCard class
		CreditCard c1 = new CreditCard();
		c1.pay(10000);
		
		//creating object of UPIPayment class
		UPIPayment u1 = new UPIPayment();
		u1.pay(50000);
	}

}
