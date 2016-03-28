/*Lab 3 - Kayleigh Coffey C14350506 */


package com.test.lab3;

public class Employee 
{
	//ATTRIBUTES
	private String firstName;
	private String surName;
	private int staffNumber;
	private double baseAnnualSalary;
	private String startDate;
	
	//METHODS
	Employee(String firstName, String surName, int staffNumber, double baseAnnualSalary, String startDate)
	{
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setStaffNumber(staffNumber);
		this.setBaseAnnualSalary(baseAnnualSalary);
		this.setStartDate(startDate);
	}
	
	public double calculatePay()
	{
		return (getBaseAnnualSalary()/12);
	}

	
	///////////SETTERS AND GETTERS /////////////
	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getSurName()
	{
		return surName;
	}

	public void setSurName(String surName) 
	{
		this.surName = surName;
	}

	public int getStaffNumber()
	{
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber) 
	{
		this.staffNumber = staffNumber;
	}

	public double getBaseAnnualSalary() 
	{
		return baseAnnualSalary;
	}

	public void setBaseAnnualSalary(double baseAnnualSalary) 
	{
		this.baseAnnualSalary = baseAnnualSalary;
	}

	public String getStartDate()
	{
		return startDate;
	}

	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}


	//toString//
	public String toString()
	{
		String content = ("This object has a firstname of " + firstName + " and a surname of "
						+ surName + " a setStaff Number of " + staffNumber + 
						" a base annual salary of " + baseAnnualSalary + ", and a start date of "
						+ startDate );
						
		return content; 
	}
}



