package com.test.lab4;

public class Account implements ValidateAccount
{
	//attributes
	private String accountName;
	private int accountNumber;
	private String sortCode;
	private String branchName;
	private boolean inCredit;
	private double acctBalance;
	
	//methods
	public Account(String accountName, int accountNumber, String sortCode, String branchName, boolean inCredit, double acctBalance)
	{
		this.setAccountName(accountName);
		this.setAccountNumber(accountNumber);
		this.setAcctBalance(acctBalance);
		this.setBranchName(branchName);
		this.setInCredit(inCredit);
		this.setSortCode(sortCode);
	}
	
	
	//Setters and Getters
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getSortCode() {
		return sortCode;
	}
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public boolean isInCredit() {
		return inCredit;
	}
	public void setInCredit(boolean inCredit) {
		this.inCredit = inCredit;
	}
	public double getAcctBalance() {
		return acctBalance;
	}
	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}
		
	
		
	public void deposit(double depositAmount)
	{
		setAcctBalance(getAcctBalance() + depositAmount);
	}
		
		
	public void withdraw(double withdrawAmount)
	{
		setAcctBalance(getAcctBalance()- withdrawAmount);
		if(getAcctBalance()<0)
		{
			setInCredit(false);
		}
	}
	
	public String toString()
	{
		return ("Account Name is: " + accountName + " .Account Number is: " + accountNumber +
							" .Sort Code is: "+ sortCode + " .Branch name is: " + branchName + " .In Credit amount: "
							+ inCredit + " .Account Balance is: " + acctBalance);
		
	}


	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		
	}
	
	
}