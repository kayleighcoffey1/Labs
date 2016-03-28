package com.test.lab4;

public class DepositAccount extends Account
{
	//Attributes
	private double interestRate;
	
	//method
	
	DepositAccount(String accountName, int accountNumber, String sortCode, String branchName, boolean inCredit, double acctBalance, double interestRate)
	{
		super(accountName, accountNumber, sortCode, branchName, inCredit, acctBalance );
		this.setInterestRate(interestRate);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public String toString()
	{
		return(super.toString() + " .Interest rate is: " + interestRate) ;
	} 
	

}
