package javaGarage;

public class Motorbike extends Vehicle
{
	/////////Attributes//////////
	protected int engineClass;
	
	/////////Constructors//////////
	Motorbike(int vWheels, int vWeight, String vMake, String vModel, 
			String vColour, int vEngineClass)
	{
		super(vWheels, vWeight, vMake, vModel, vColour);
		this.engineClass = vEngineClass;
		
	}

	Motorbike(int vWheels,String vMake, String vModel, 
			String vColour)
	{
		super(vWheels, vMake, vModel, vColour);
		this.engineClass = 0;
		
	}
	
	/////////Methods//////////
	public void setEngineClass(int vEngineClass)
	{
		this.engineClass = vEngineClass;
	}
	
}
