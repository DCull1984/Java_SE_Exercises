package zoo.example.exercise;

public class Cat extends Mammals
{
	//////////////////////Attributes////////////////////////////
	private String colour;
	private String type;
	
	
	//////////////////////Constructors///////////////////
	Cat (String mType, String mColour,int mNoOfLegs)
	{
		super(mNoOfLegs);
		this.colour = mColour;
		this.type = mType;
		
	}
	
	
	///////////////////////Methods//////////////////
	
	public String toString()
	{
		return "Animal: " + this.type + " |Colour: " + this.colour;
	}
}