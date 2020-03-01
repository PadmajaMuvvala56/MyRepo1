package com.icici.loans.carloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args) 
	{
       ChildClass c1 = new ChildClass();
       c1.m1();
       //System.out.println(c1.hashCode());
       c1.m2();
     
	}
	
	public void m1()
	{
		System.out.println("i am overriden m1 from child class");
	}

	@Override
	public void m2() {
		System.out.println("i am overriden m2 from child class");
		
	}

}
