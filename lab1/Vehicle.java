/******************************
 * Vehicle class
 * Author: Kayleigh Coffey
 * Date: 28/01/2016
 */

package com.test.lab1;

public class Vehicle 
{
	//attributes
	String 	Owner;
	int 	regNumber;
	int		maxSpeed;
	String 	colour;
	String  automatic;
	int 	numOfWheels;
	
	//methods
	Vehicle(String Owner)
	{
		this.Owner = "";
		System.out.println("Owner" + Owner);
		
	}//end of Vehicle(owner)
	
	Vehicle(String Owner, int regNumber, int maxSpeed, String colour, String automatic, int numOfWheels)
	{
		this.Owner = "Kayleigh Coffey";
		this.regNumber = regNumber;
		this.maxSpeed = maxSpeed;
		this.colour = colour;
		this.automatic = automatic;
		this.numOfWheels = numOfWheels;
	}//end of vehicle
	
	public String toString()
	{
		String content = "This vehicle is owned by " + Owner +
							"the colour is" + colour + "and the reg number is" + regNumber;
		
		return content;
		
	}
	
}
