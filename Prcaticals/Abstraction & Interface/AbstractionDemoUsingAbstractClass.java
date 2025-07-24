package com.corejava;

abstract class ATM
{
	abstract void withdraw(double amt); // abstract method
    void dispBalance()  // normal method or concrete method
    {
    	System.out.println("balance is displayed");
    }
}

class SBIATM extends ATM
{   @Override
	void withdraw(double amt)
	{
		System.out.println("In SBI ATM m/c, withdranwn amount is "+amt);
	}
}

class IBATM extends ATM
{
	void withdraw(double amt)
	{
		System.out.println("In IB ATM m/c, withdranwn amount is "+amt);
	}
}



public class AbstractionDemoUsingAbstractClass {

	public static void main(String[] args) {
		
      ATM user1 = new SBIATM();
      user1.withdraw(1000);
      user1.dispBalance();
      
      ATM user2 = new IBATM();
      user2.withdraw(2000);
      user2.dispBalance();
	}

}
