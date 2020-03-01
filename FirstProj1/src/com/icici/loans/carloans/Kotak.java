package com.icici.loans.carloans;

public class Kotak implements Rbi
{

	public static void main(String[] args)
	{
       Kotak h = new Kotak();
       h.withdrawl();
       h.deposit();

	}

	@Override
	public void withdrawl()
	{
	System.out.println("i am overriden withdrawl from Kotak class");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overriden deposit from Kotak class");
		
	}

}
