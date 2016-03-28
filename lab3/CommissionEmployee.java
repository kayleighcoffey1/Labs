package com.test.lab3;

public class CommissionEmployee extends Employee
{
	//ATTRIBUTES
	private double commissionEarned;
	
	CommissionEmployee(String firstName, String surName, int staffNumber, double baseAnnualSalary, String startDate, double commissionEarned)
	{
		super(firstName, surName, staffNumber, baseAnnualSalary, startDate);
		this.setCommissionEarned(commissionEarned);
		
	}
	public double calculatePay()
	{
		return (getBaseAnnualSalary()/12 + getCommissionEarned());
	}

	private double getCommissionEarned() 
	{
		return commissionEarned;
	}

	private void setCommissionEarned(double commissionEarned) 
	{
		this.commissionEarned = commissionEarned;
	}
	
	public String toString()
	{
		return(super.toString() + " Commision earned is: " + commissionEarned) ;
	} 
}
