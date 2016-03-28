package com.test.lab5;

public class Person 
{
	//attributes//
	private String firstName;
	private String surName;
	private Date dOB;
	private String gender;
	
	//method
	public Person(String firstName,String surName,Date dOB, String gender)
	{
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setdOB(dOB);
		this.setGender(gender);
	}
	
	//SETTERS AND GETTERS
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public Date getdOB() {
		return dOB;
	}
	public void setdOB(Date dOB) {
		this.dOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
