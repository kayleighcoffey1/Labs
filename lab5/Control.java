package com.test.lab5;

public class Control 
{
	public static void main(String args[])
	{
		Date date1 = new Date (01,12,2015);
		Job job1 = new Job (11.50,"Waiter",2345);
		
		Date KayleighDate = new Date(05,10,1995);
		Date Startdate1 = new Date(10,03,2011);
		Person person1 = new Employee("Kayleigh","Coffey",KayleighDate,"Female",job1,Startdate1);

		System.out.println(date1.toString());
		System.out.println(job1.toString());
		System.out.println(person1.toString());
	}
}
