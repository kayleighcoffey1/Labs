package com.test.lab3;

public class Control 
{
	public static void main(String args[])
	{
		Employee employee1 = new Employee("John","Murphy",12345,22345.50,"5 September 2014");
		HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Kayleigh","Coffey",4567,87937.98,"18 January 2015",40.5,8.5);
		CommissionEmployee commissionEmployee3 = new CommissionEmployee("Andrew","Kennedy",877989,8373.34,"12 November 2011",300);
		
		System.out.println(employee1.toString());
		System.out.println(hourlyEmployee2.toString());
		System.out.println(commissionEmployee3.toString());
		
		Employee[] myEmployee = new Employee[6];
		myEmployee[0]= new Employee ("Catherine","Oneil",21321,1313.33,"15 April 2010");
		myEmployee[1]= new HourlyEmployee("Laura","Whitmore",32131,12313.50,"20 January 2014",21.4,8.5);
		myEmployee[2]= new CommissionEmployee("Daragh","Smith",442342,4142.64,"31 October 2015",400);
		myEmployee[3]= new Employee ("Dave","Smith",132321,3123.43,"21 May 2015");
		myEmployee[4]= new HourlyEmployee("Ciara","White",73832,12313.50,"20 October 2014",21.4,8.5);
		myEmployee[5]= new CommissionEmployee("Dean","Brown",442342,4142.64,"31 August 2015",400);
		
		for(int i=0; i<myEmployee.length; i++)
		{
			myEmployee[i].calculatePay();
			System.out.println(myEmployee[i].toString());
			
		}
		
				
				
		
	}
	
	
	
}
