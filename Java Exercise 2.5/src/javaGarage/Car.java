package javaGarage;

public class Car extends Vehicle
{
	/////////Attributes//////////
	protected int maxPassengers;
	
	
	
	/////////Constructors//////////
	Car(int vWheels, int vWeight, String vMake, String vModel, String vColour,
			int vMaxPassengers)
	{
		super(vWheels, vWeight, vMake, vModel, vColour);
		this.maxPassengers = vMaxPassengers;
	}
	
	Car(int vWheels, int vWeight, String vMake, String vModel, String vColour)
	{
		super(vWheels, vWeight, vMake, vModel, vColour);
		this.maxPassengers = 0;
	}

	
	/////////Methods//////////
	public void setMaxPassengers(int vMaxPassengers)
	{
		this.maxPassengers = vMaxPassengers;
	}
	
	/*public void setWeight(int vWeight)
	{
		this
	}*/
	
	public String toString()
	{
		return
	}
	
}
