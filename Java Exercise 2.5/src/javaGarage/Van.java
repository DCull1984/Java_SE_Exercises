package javaGarage;

public class Van extends Vehicle
{
	/////////Attributes//////////
	protected String totalCapacity;
	
	
	/////////Constructors//////////
	Van(int vWheels, int vWeight, String vMake, String vModel, 
			String vColour, String vTotalCapacity)
	{
		super(vWheels, vWeight, vMake, vModel, vColour);
		this.totalCapacity = vTotalCapacity;
	}
	
	Van(int vWheels, int vWeight, String vMake, String vModel, 
			String vColour)
	{
		super(vWheels, vWeight, vMake, vModel, vColour);
		this.totalCapacity = "Nothing";
	}
	
	/////////Methods//////////
	public void setTotalCapacity(String vTotalCapacity)
	{
		this.totalCapacity = vTotalCapacity;
	}
	
	
}
