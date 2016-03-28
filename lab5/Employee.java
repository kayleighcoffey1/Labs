package com.test.lab5;

public class Employee extends Person
{
	//attributes
	private String job;
	protected static int currentNum = 100;
	private Date startDate;
	private int persNum;
	
	//methods
	Employee(String firstName,String surName,Date DOB, String gender, Job job1, Date startDate)
	{
		super(firstName,surName,DOB,gender);
		this.setJob(job);
		currentNum++;
		this.setStartDate(DOB);
		this.setPersNum(currentNum);
		
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getPersNum() {
		return persNum;
	}

	public void setPersNum(int persNum) {
		this.persNum = persNum;
	}
	
	public String toString()
	{
		return("Firstname: " + getFirstName() + " Surname: " + getSurName() + "D.O.B: " + getdOB() + "Gender: " + getGender()
		+ "Job: " + getJob()+"Start date: " + getStartDate()+ "Personal Number:" +getPersNum());
	
		 /*String myFileName = "names.txt";
		 try
		 {
		 PrintWriter myOutFile =new PrintWriter(myFileName);
		 myOutFile.print("here’s my first line");
		 myOutFile.println("and another");
		 myOutFile.close();
		 }
		 catch(Exception ex) 
		 {
		 System.out.println("exception "+ex.getMessage()+"caught");
		 }*/
	}
}
