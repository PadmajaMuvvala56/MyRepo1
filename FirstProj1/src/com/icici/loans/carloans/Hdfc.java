package com.icici.loans.carloans;

public class Hdfc implements Rbi
{

	public static void main(String[] args)
	{
       Hdfc h = new Hdfc();
       h.withdrawl();
       h.deposit();

	}

	@Override
	public void withdrawl()
	{
	System.out.println("i am overriden withdrawl from hdfc class");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overriden deposit from hdfc class");
		
	}

}
