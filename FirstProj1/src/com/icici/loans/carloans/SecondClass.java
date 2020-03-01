package com.icici.loans.carloans;

public class SecondClass 
{
	int a=10,b=20,c;
	
	
	public void add()
	{
		c=a+b;
		System.out.println("addition is : "+c);
		
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("sub is : "+c);
	}
	
	public int add2(int a, int b) {
		
		c= a+b;
		return c;		
	}
	
	public static void main(String[] args)
    {
		//int d;
	  System.out.println("hello");
	   
	  SecondClass obj = new SecondClass();
	  obj.add();
	  obj.sub();
	  System.out.println(obj.c);
	  
	  SecondClass obj2 = new SecondClass();
	  int d= obj2.add2(5, 4);
	  System.out.println("add of second obj variables : " +d);
	  
	  System.out.println("C : " + obj2.c);
	}

}
