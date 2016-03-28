package com.test.lab3;

public class HourlyEmployee extends Employee
{
	//ATTRIBUTES
	private double hoursWorked;
	private double hourlyRate;
	
	//CONSTRUCTOR
	HourlyEmployee(String firstName, String surName, int staffNumber, double baseAnnualSalary, String startDate, double hoursWorked, double hourlyRate)
	{
		super(firstName, surName, staffNumber, baseAnnualSalary, startDate);
		this.setHoursWorked(hoursWorked);
		this.setHourlyRate(hourlyRate);
	}
	
	public double calculatePay()
	{
		return (getHourlyRate()*getHoursWorked());
	}

	private double getHourlyRate() {
		return hourlyRate;
	}

	private void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}

	private double getHoursWorked() 
	{
		return hoursWorked;
	}

	private void setHoursWorked(double hoursWorked) 
	{
		this.hoursWorked = hoursWorked;
	}
	
	public String toString()
	{
		
		return(super.toString() + "The hours worked are:" + hoursWorked + " and their hourly rate is:" + hourlyRate );
		 
	}
	
}
