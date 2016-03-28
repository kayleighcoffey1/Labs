package com.test.lab4;

public class Control 
{
	public static void main(String args[])
	{
		Account 	   account1 = new Account("Orla",8967,"IE774D2","AIB",true,450.50);
		DepositAccount account2 = new DepositAccount("Jim",3417,"IE2839W3","Ulster Bank",false,000.00,5.6);
		CurrentAccount account3 = new CurrentAccount("Paul",9302,"IE2342N2","Bank Of Ireland",true,210.35,55.50);
		

		System.out.println(account1.toString());
		account1.deposit(100);
		System.out.println("Account Balance is: "+ account1.getAcctBalance());
		
		System.out.println(account2.toString());
		account2.withdraw(350);
		System.out.println("Account Balance is: "+ account2.getAcctBalance());
		
		System.out.println(account3.toString());
		account3.deposit(20);
		System.out.println("Account Balance is: "+ account3.getAcctBalance());
		
	}
}
