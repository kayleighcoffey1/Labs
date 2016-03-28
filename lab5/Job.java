package com.test.lab5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Job 
{
	//attributes
	private double salary;
	private String role;
	private int jobID;
	File RolesFile;
	Scanner MyScanner;
	void getFile()
	{
		try
		{
			RolesFile = new File("Roles.txt");
			MyScanner = new Scanner(RolesFile);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
	
	//constructors 
	public Job(double salary, String role, int jobID)
	{
		this.setSalary(salary);
		this.setJobID(jobID);
		this.setRole(role);
	}//end job method
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private String getRole() {
		return role;
	}
	private void setRole(String role) {
		this.role = role;
	}
	public int getJobID() {
		return jobID;
	}
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	
	public String toString()
	{
		return(" Salary: " + salary + " Role: " + role + " JobId: " + jobID);
		

	}
}
