package javaGarage;

public class Van extends Vehicle
{
	/////////Attributes//////////
	protected String type;
	
	
	/////////Constructors//////////
	Van(int vWheels, int vWeight, String vMake, String vModel, 
			String vColour, String vType)
	{
		super(vWheels, vWeight, vMake, vModel, vColour);
		this.type = vType;
	}
	
	Van(int vWheels, int vWeight, String vMake, String vModel, 
			String vColour)
	{
		super(vWheels, vWeight, vMake, vModel, vColour);
		this.type = "Nothing";
	}
	
	/////////Methods//////////
	public void setTotalCapacity(String vType)
	{
		this.type = vType;
	}
	
	
}
