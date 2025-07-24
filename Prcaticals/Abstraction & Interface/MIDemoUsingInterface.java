package com.corejava;

interface A    // parent1 
{
    void msg();  // abstract method
  }  

interface B   //  parent 2
{
    void msg();  // abstract method
    
}
 
class C implements A, B  // child
{
    public void msg()
    {
      System.out.println("msg method is executed");
     }
}

class MIDemoUsingInterface  // main class
{
   public static void main(String args[])
   {
      C obj = new C();
       obj.msg();

   }
}

   