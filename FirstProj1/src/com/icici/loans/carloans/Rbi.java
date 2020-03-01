package com.icici.loans.carloans;

public interface Rbi
{
	public void withdrawl();
	public void deposit();
	
	
	public static void main(String[] args)
	{
		
		 Rbi i;
		 i = new Hdfc();
		 i.deposit();
		 i.withdrawl();
		 System.out.println("Hdfc i: " + i.hashCode() + "--address--" + i);
		 
		 i = new Kotak();
		 i.deposit();
		 i.withdrawl();
		 System.out.println("Kotak i: " + i.hashCode()+ "--address--" + i);
		 
	}

}
