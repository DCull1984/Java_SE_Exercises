package zoo.example.exercise;

public class Birds extends Animal
{
	//////////////////////Attributes////////////////////////////
	private String colour;
	private String type;
	


	//////////////////////Constructors///////////////////
	Birds (String mType, String mColour, String mName)
	{
		super(mName);
		this.colour = mColour;
		this.type = mType;

	}


	///////////////////////Methods//////////////////

	public String toString()
	{
		return "Animal: " + this.type + " |Colour: " + this.colour;
	}
	
	
	
}
