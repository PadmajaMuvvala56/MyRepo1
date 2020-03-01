package com.icici.loans.carloans;

public abstract class FirstAbstract
{

	public void m1()
	{
		System.out.println("i am m1 concrete method from firstabstract");
	}
	
	public abstract void m2();
	
	/*
	 * public static void main(String[] args)
	 *  { 
	 * FirstAbstract f= new FirstAbstract(): 
	 * }
	 */
	
	public static void main(String[] args) {
		FirstAbstract f= new ChildClass();
		f.m1();
		f.m2();
	}
	
	
	
}
