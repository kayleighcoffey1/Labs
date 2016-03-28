package com.test.lab4;

public class CurrentAccount extends Account implements ValidateAccount
{
	//attributes
	private double penaltyAmount;
	
	CurrentAccount(String accountName, int accountNumber, String sortCode, String branchName,
					boolean inCredit, double acctBalance, double penaltyAmount)
	{
		super(accountName, accountNumber, sortCode, branchName, inCredit, acctBalance );
		this.setPenaltyAmount(this.getPenaltyAmount());
	}
	

	public double getPenaltyAmount() 
	{
		return penaltyAmount;
	}

	public void setPenaltyAmount(double penaltyAmount) 
	{
		this.penaltyAmount = penaltyAmount;
	}
	
	public void withdraw(double withdrawAmount)
	{
		if(getAcctBalance() - withdrawAmount < 0)
		{
			System.out.println("Insufficient funds");
		}//end if
	}//end withdraw
	
	public String checkCredit()
	{
		String warningMessage;
		boolean check = isInCredit();
		if(check == true)
		{
			warningMessage = ("Account is in credit");
			return warningMessage;
		}
		else
		{
			warningMessage = ("Account is not in credit");
			return warningMessage;
		}
	}
	
	public void checkCredit(String warning)
	{
		warning = checkCredit();
		if (getAcctBalance()<100 && getAcctBalance()>0)
		{
			System.out.println(warning);
		}
		
		
	}
	
	public String toString()
	{
		return(super.toString() + " .Penalty Amount is: " + penaltyAmount) ;
	} 
}
