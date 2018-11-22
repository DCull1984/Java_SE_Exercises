package javaGarage;

public abstract class Vehicle 
{
	/////Attributes/////
	protected int wheels;
	protected int weight;
	protected String make;
	protected String model;
	protected String colour;
	/////Constructors/////
	Vehicle (int vWheels, int vWeight, String vMake, String vModel, String vColour)
	{
		this.wheels = vWheels;
		this.weight = vWeight;
		this.make = vMake;
		this.model = vModel;
		this.colour = vColour;
	}
	
	Vehicle (int vWheels, String vMake, String vModel, String vColour)
	{
		this.wheels = vWheels;
		this.weight = 0;
		this.make = vMake;
		this.model = vModel;
		this.colour = vColour;
	}
	
	/////Methods/////
	public void setWeight(int vWeight) 
	{
	       this.weight = vWeight;
	}
	
	public String toString()
	{
		return wheels + weight + make + model + colour;
	}
}
