package com.test.lab5;

public class Date 
{
	//attributes//
	private int day;
	private int month;
	private int year;
	
	//constructors//
	public Date(int day,int month,int year)
	{
		if(month<=0 || month>12)
		{
			throw new IllegalArgumentException("Month must be greater than 0 and less than or equal to 12");
		}//end first if
		
		if(day<=0 || day>31)
		{
			throw new IllegalArgumentException("Day must be greater than 0 and less than or equal to 31)");
		}
		
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
		
	}
	
	//SETTERS AND GETTERS//
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString()
	{
		return ("day: " + day + "month: " + month + "year : " +year);
	}
	
	
	
	
}
