package com.test.lab2;

public class Control 
{
	public static void main(String args[])
	{
		Animal animal1 = new Animal("Spot","dog",4,true,"brown");
		Animal animal2 = new Animal("Leo","dog",4,false,"white");
		Animal animal3 = new Animal("Max","dog",4,true,"brown");
		
		/*System.out.println(animal1.name);
		System.out.println(animal2.domestic);
		System.out.println(animal3.noOfLegs);*/
		
		
		
		 
		System.out.println(animal1.getName());
		System.out.println(animal1.getBreed());
		System.out.println(animal1.getNoOfLegs());
		animal1.makeNoise();
		animal1.makeNoise("loud");
		
	}

}
