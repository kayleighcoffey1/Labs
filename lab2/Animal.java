/*Kayleigh Coffey C14350506
 * Lab 2 - Animal class
 * 04/02/2016
 */

package com.test.lab2;

public class Animal 
{
	//attributes
	private String	name;
	private String 	breed;
	private int 	noOfLegs;
	private boolean domestic;
	private String 	colour;

	//constructors 
	public Animal(String name)
	{
		this.name = "";
		System.out.println("Name:" + name);
	}
	
	public Animal(String name, String breed, int noOfLegs, boolean domestic, String colour)
	{
		this.name = name;
		this.breed = breed;
		this.noOfLegs = noOfLegs;
		this.domestic = domestic;
		this.colour = colour;
		
		/*System.out.println("This object is a " + breed +",called " + name +
							" that is " + colour + " in colour, and has " + noOfLegs +
							"legs and is " + domestic);*/
	}
	 //////////////////////SETTERS////////////////////////////
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public void setNoOfLegs(int noOfLegs)
	{
		this.noOfLegs = noOfLegs;
	}
	
	public void setDomestic(boolean domestic)
	{
		this.domestic = domestic;
	}
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	///////////////////////GETTERS////////////////////
	
	public String getName()
	{
		return name;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public int getNoOfLegs()
	{
		return noOfLegs;
	}
	
	public boolean getDomestic()
	{
		return domestic;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	///////*****PART 4 - OVERLOADING METHODS**********//////////
	public void makeNoise()
	{
		if (breed.equals("dog"))
		{
			System.out.println("woof,woof");
		}//end if
		else if(breed.equals("cat"))
		{
			System.out.println("meow");
		}//end else
		
	}// end makeNoise()
	
	public void makeNoise(String Volume)
	{
		if (Volume.equals("loud"))
		{
			if (breed.equals("dog"))
			{
				System.out.println("WOOF,WOOF");
			}//end if
			else if(breed.equals("cat"))
			{
				System.out.println("MEOW");
			}//end elsE
		
		}//end if
		else 
		{
			if (breed.equals("dog"))
			{
				System.out.println("woof,woof");
			}//end if
			else if(breed.equals("cat"))
			{
				System.out.println("meow");
			}//end else
		}//end outer else
	}//end make noise
}//end class